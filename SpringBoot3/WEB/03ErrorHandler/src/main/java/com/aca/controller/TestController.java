package com.aca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/01
 */
@RestController
public class TestController {

    @GetMapping("/")
    public Object welcome() {
        int i = 1 / 0;
        return "hi";
    }

    // ExceptionHandler标识一个方法处理错误，但只能处理这一个类发生的指定错误，里面的参数value为要捕获的异常类型
//    @ExceptionHandler(Exception.class)
//    public Object handleException(Exception e) {
//
//        return "Woops. Something is Wrong!" + e.getMessage();
//    }
}
