## SB与Junit整合
[这里](src/test/java/com/aca/UserServiceTest.java)


测试类上加入两个注解
1. @SpringBootTest(classes = 启动类.class)

   指定要加载的Spring Boot应用程序的主配置类
2. @RunWith(SpringRunner.class)

   这是JUnit运行器注解