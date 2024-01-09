package com.aca.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: acn
 * @Date: 2024/01/09/20:46
 */
@Component
@Data
@ConfigurationProperties(prefix = "person")
public class Person {
    String name;
    String age;
    String speech;
}
