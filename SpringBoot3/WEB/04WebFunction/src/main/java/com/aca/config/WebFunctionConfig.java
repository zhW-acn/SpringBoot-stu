package com.aca.config;

import com.aca.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/02
 */
@Configuration
public class WebFunctionConfig {


    //    @Bean
//    public RouterFunction<ServerResponse> userRoute(){
//        RouterFunctions.route() // 开始定义
//                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL),request -> {
//                    // 业务处理
//                    // 构造响应
//                    return ServerResponse.ok().body(...);
//                });// 请求路径，由谁处理
//        return null;
//    }
    @Bean
    public RouterFunction<ServerResponse> userRoute(UserService userService) {
        return RouterFunctions.route()
                // 定义请求类型（请求路径，头信息accept有指定MIME，调用函数）
                .GET("/user/{id}", RequestPredicates.accept(MediaType.APPLICATION_JSON), userService::getUser)
                .POST("/user", userService::addUser)
                .PUT("/user",userService::updUser)
                .DELETE("/user/{id}",userService::delUser)
                .build();
    }
}
