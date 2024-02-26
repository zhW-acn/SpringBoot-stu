package com.aca.config;

import com.aca.properties.MyProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @Description:
 * @Author: aca
 * @Date: 2024/02/26
 */
@Configuration
//@EnableConfigurationProperties(MyProperties.class)
public class MyConfig {

    @Bean
    public MyProperties myPropertiesTest(){
        return new MyProperties();
    }
}
