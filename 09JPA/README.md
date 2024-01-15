## SB整合SpringData JPA

1. 编写实体类，配置映射关系
    ```java
        @Data
        @Entity // 标记实体类
        @Table(name = "user") // 指定和哪个数据表对应，缺省表名为类名小写
        public class User {
        @Id // 标记主键
        @GeneratedValue(strategy = GenerationType.IDENTITY)// 主键自增策略
        Integer id;
        
            @Column(name = "username", length = 50) // 列名
            String name;
        }
    ```
2. 编写dao层接口
   ```java
   // 继承JpaRepository，泛型内容为实体类和主键类型
   public interface UserRepository extends JpaRepository<User,Integer> {
   }
   ```