package com.aca.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/01
 */

@ControllerAdvice
public class GlobalExceptionHandler {// 集中处理全局异常

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {

        return "统一处理 Woops. Something is Wrong!" + e.getMessage();
    }
}
