## Spring Security是什么
Spring Security是Spring的安全框架。
- WebSecurityConfigurerAdapter：自定义Security策略
- AuthenticationManagerBuilder：自定义认证策略
- @EnableWebSecurity：开启WebSecurity模式

安全框架主要实现的两个区域是：“认证”和“授权”

- 认证：证明你是谁
- 授权：你能干什么
## 如何使用
1. 起步依赖
    
    ```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    ```
2. 编写Security配置类
3. 控制请求访问权限
.......感觉。。记笔记不如。。看[文档](https://docs.spring.io/spring-security/reference/servlet/getting-started.html)。。有用