以`HttpEncodingAutoConfiguration`类为例，其标注了以下注解

```java
@Configuration
@EnableConfigurationProperties(HttpProperties.class)
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@ConditionalOnClass(CharacterEncodingFilter.class)
@ConditionalOnProperty(prefix = "spring.http.encoding", value = "enabled", matchIfMissing = true)
public class HttpEncodingAutoConfiguration {}
```
- `@Configuration`：该类是个配置类，可以给容器中添加组件
- `@EnableConfigurationProperties(HttpProperties.class)`：启动指定类的ConfigurationProperties功能
- `@Conditional`：如果满足指定的条件，整个配置类里的配置就会生效
- `@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)`：是否为web应用
- `@ConditionalOnClass(CharacterEncodingFilter.class)`：类里是否存在CharacterEncodingFilter编码过滤器
- `@ConditionalOnProperty(prefix = "spring.http.encoding", value = "enabled", matchIfMissing = true)
  `：判断配置文件中是否有spring.http.encoding.enabled的值。默认为true

`HttpProperties`类中标注了`@ConfigurationProperties(prefix = "spring.http")`注解
- @ConfigurationProperties：从配置文件中获取指定的值和bean的属性进行绑定

**即、所有在配置文件中能配置的属性都封装在xxxProperties类中，配置文件能配哪些都在这个类中定义着**