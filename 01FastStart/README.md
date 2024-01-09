## 总结
### 启动SpringBoot一个web工程需要做的
1. 创建maven项目
2. 在pom中规定一个父工程，这个父工程是SpringBoot的web的启动依赖
3. 主启动类：加`@SpringBootApplication`注解，main方法调用`SpringApplication.run()`方法
4. 业务逻辑。。。 
5. SpringBoot在创建项目时，使用jar包打包

### 也可以用idea的Spring启动器
需要注意的是我的idea2023.3.2只能使用jdk17和21构建，且controller包的位置要写对【与启动类同包】

### 对比Spring
Spring的缺点体现出来了：
1. 配置繁琐：需要写大量的xml
2. 依赖繁琐：maven需要大量的依赖，用不好还可能引发循环依赖和依赖冲突的问题

SpringBoot起步依赖：
- 在spring-boot-starter-parent中定义了各种技术的版本信息
- 在各种starter中，定义了完成该功能需要的坐标合计，其中大部分版本信息源于父工程
- 所以工程继承parent，引入starter后，通过依赖传递即可获取需要的jar包，并不会存在版本冲突等问题