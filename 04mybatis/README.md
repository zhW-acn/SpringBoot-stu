## SB与MyBatis整合

1. application.yml中配置数据源信息
    
    配置spring.datasource
   ```yaml
    spring:
      datasource:
      url: jdbc:mysql://localhost:3306/test
      driver-class-name: com.mysql.cj.jdbc.Driver
      username: root
      password: acane
    ```
2. 注解方式

   建包，建类，@Mapper，写SQL
3. XML方式
   - 建mapper文件夹
   - 在application.yml中指定所有mapper位置
     ```yaml
     mybatis:
       mapper-locations: classpath:mapper/*.xml
     ```
   - 建mapper，写SQL
4. @MapperScan注解

   在启动类标记该注解。basePackages或value指定包名，这个包名下的所有类都标记了@Mapper注解