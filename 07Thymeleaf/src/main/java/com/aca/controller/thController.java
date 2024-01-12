package com.aca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/01/13
 */
@Controller
public class thController {

    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("hello","你好，我是aca");
        model.addAttribute("list", Arrays.asList("夏和小","藤田茜","枣子姐"));
        return "index";
    }
}
