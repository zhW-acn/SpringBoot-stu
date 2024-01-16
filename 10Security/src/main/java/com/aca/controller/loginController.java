package com.aca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/01/17
 */
@Controller
public class loginController {

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin/index.html";
    }
    @GetMapping("/user")
    public String user(){
        return "user/index.html";
    }
    @GetMapping("/tourist")
    public String tourist(){
        return "tourist/index.html";
    }



}
