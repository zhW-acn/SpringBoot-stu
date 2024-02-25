## SpringBoot对SpringMVC的自动配置
1. 自动配置了ViewResolver
2. 静态资源文件夹、首页、图标
3. 自动注册Converter、Formatter、HttpMessageConverter

### 自定义ViewResolver
```java
 @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
```
在DispatcherServlet类中的doDispatch()方法里，在viewResolvers列表里可以看到

## 编写配置类，扩展SpringMVC功能
编写的配置类（@Configuration），要是WebMvcConfigurationAdapter类型，且不能标注@EnableWebMvc注解。目的是保留了自动配置，也能用扩展的功能。

如果启用了@EnableWebMvc注解，表示SB的MVC自动配置失效。所有相关配置需要自己写。

原理：
1. WebMvcAutoConfiguration是SpringMvc的自动配置类
    ```
    @Configuration
    @Import(EnableWebMvcConfiguration.class)
    @EnableConfigurationProperties({ WebMvcProperties.class, ResourceProperties.class })
    @Order(0)
    public static class WebMvcAutoConfigurationAdapter implements WebMvcConfigurer {
    ```
2. 在做其他配置时会导入@Import(EnableWebMvcConfiguration.class)
   ```
   	@Configuration
	  public static class EnableWebMvcConfiguration extends DelegatingWebMvcConfiguration implements 
   ResourceLoaderAware {
   ```
   
   ```
    @Configuration
    public class DelegatingWebMvcConfiguration extends WebMvcConfigurationSupport {
	  private final WebMvcConfigurerComposite configurers = new WebMvcConfigurerComposite();
      // 从容其中获取所有的WebMvcAutoConfigurer，然后一一调用添加
	  @Autowired(required = false)
	  public void setConfigurers(List<WebMvcConfigurer> configurers) {
		  if (!CollectionUtils.isEmpty(configurers)) {
	  		this.configurers.addWebMvcConfigurers(configurers);
	  	}
	  }
   ```
3. 为什么加上了@EnableWebMvc注解自动配置会失效
   
    WebMvcConfiguration类上标注了`@ConditionalOnMissingBean(WebMvcConfigurationSupport.class)`注解。检查容器中是否有这个组件，如果没有，则生效。

    而@EnableWebMvc注解上标记了`@Import(DelegatingWebMvcConfiguration.class)
   `，`DelegatingWebMvcConfiguration`继承了`WebMvcConfigurationSupport`类，所以标记了@EnableMvc，自动配置会失效