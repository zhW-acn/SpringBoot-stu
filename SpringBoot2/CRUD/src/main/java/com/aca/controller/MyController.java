package com.aca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/01/14
 */
@Controller
public class MyController {
    @GetMapping("/")
    public String index(HttpServletRequest request) {
        System.out.println("Accept-Language:" + request.getHeader("Accept-Language"));
        return "index";
    }
}
