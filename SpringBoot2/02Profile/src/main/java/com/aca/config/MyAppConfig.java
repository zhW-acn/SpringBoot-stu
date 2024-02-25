package com.aca.config;

import com.aca.controller.HelloController;
import com.aca.service.Myservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: acn
 * @Date: 2024/01/12/4:55
 */

/**
 * Configuration注解标记该类是一个配置类，代替Spring配置文件
 * 使用@Bean注解代替配置文件中的<bean></bean>标签，@Bean注解的作用是
 * 将方法的返回值添加到容器中，id为其方法名
 */
@Configuration
public class MyAppConfig {

    @Bean
    public Myservice myService(){
        return new Myservice();
    }
}
