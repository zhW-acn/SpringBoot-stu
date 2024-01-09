package com.aca.controller;

import com.aca.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: acn
 * @Date: 2024/01/09/15:38
 */
@RestController
public class HelloController {

    @Value("${name}")
    String name;

    @Value("${speech.1}")
    String s1;

    @Value("${speech.2}")
    String s2;

    @Value("${list[0]}")
    String domain;


    @Autowired
    Environment env;


    @Autowired
    Person person;

    @GetMapping("/")
    public String index() {
        // 使用Value取值
        System.out.println("name = " + name);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("domain = " + domain);

        // 使用Environment变量取值
        System.out.println("env.getProperty(\"domain[1]\") = " + env.getProperty("list[1]"));

        // 使用ConfigurationProperties定义一个配置类
        System.out.println("person = " + person);
        return "Hello SpringBoot!";
    }
}
