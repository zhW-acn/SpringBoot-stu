## 配置文件

SpringBoot配置是基于约定的。想要改变这些配置，需要替换配置文件。

SpringBoot配置文件和在同一目录下的优先级为`properties>yml>yaml`

### properties

两边字符串，左k右v，使用`=`连接。学过

### yml语法

- 大小写敏感
- 使用缩进表示目录关系。缩进不能使用tab键【操作系统差异】
- k与v间用`:`分割，且v与`:`间留一个空格
- `#`表示注释
- `---`表示分隔独立的文档，使得可以将它们组织在一个文件中。

### yml数据格式

[这里](src/main/resources/application.yml)

### 获取配置文件数据

1. Value注解

   取值时定义数据类型
2. Environment

   org.springframework.core.env包里的类，这个类用于访问应用程序运行时的环境【ioc】属性。使用getProperty()方法
3. ConfigurationProperties注解定义配置类
   好处是在yml中有提示了，在该配置类里定义属性。前缀prefix代表这个配置类的名字

### 多环境配置

如何在生产环境中定义和切换配置

1. 定义配置

   使用spring.profiles命名该配置文件

   ```yaml
   spring:
     profiles: dev
   ```
2. 切换配置
   
   在主配置文件中激活
   ```yaml
   spring:
     profiles:
       active: dev
   ```
   
3. 运维方面
   打成jar包后，要想切换环境配置，需要在命令`java -jar xxx.jar `后输入`--spring.profiles.active=xxx`以指定环境


### 内部配置文件优先级
./config/ > ./ > classpath:./config/ > classpath:./

### 外部配置文件
运维。。。