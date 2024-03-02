package com.aca.controller;

import com.aca.pojo.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/02/29
 */
@RestController
public class MyController {

    @GetMapping("/person")
    public Object getPerson(){
        return new Person(1,"aca",18);
    }
}
