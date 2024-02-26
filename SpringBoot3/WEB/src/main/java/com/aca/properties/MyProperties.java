package com.aca.properties;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;import org.springframework.context.annotation.Configuration; /**
 * @Description:
 * @Author: aca
 * @Date: 2024/02/26
 */
@Data
@ConfigurationProperties("my") // 配置文件绑定 my
public class MyProperties
{
    String age;

    Person person;
    public static class Person{
        static String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            Person.name = name;
        }
    }
}