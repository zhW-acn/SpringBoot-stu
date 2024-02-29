package com.aca.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/02/26
 */
@Data
@Configuration
@PropertySource(value = {"classpath:MyProperties.properties"})
@ConfigurationProperties(prefix = "my") // 配置文件绑定 my
public class MyProperties
{
    String age;

    Person person;
    @Data
    public static class Person{


        static String name;

        public Person(String name) {
            this.setName(name);
        }

        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return this.getName();
        }
        public void setName(String name) {
            Person.name = name;
        }
    }

    @Bean
    public Person person(){
        return person;
    }
}