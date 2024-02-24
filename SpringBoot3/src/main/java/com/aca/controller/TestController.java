package com.aca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/02/24
 */
@Controller
public class TestController {
    @ResponseBody
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
