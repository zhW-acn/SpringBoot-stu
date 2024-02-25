package com.aca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: acn
 * @Date: 2024/01/09/15:38
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "Hello SpringBoot!";
    }
}
