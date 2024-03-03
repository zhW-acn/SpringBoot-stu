package com.aca.service;

import com.aca.entry.User;
import jakarta.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.io.IOException;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/02
 */
@Service
public class UserService {

    public ServerResponse getUser(ServerRequest request) {
        Integer id = Integer.valueOf(request.pathVariable("id"));
        User aca = new User(id, "aca", 18);
        // 构建响应
        return ServerResponse.ok().body(aca);
    }

    public ServerResponse getUsers(ServerRequest request) {
        return ServerResponse.ok().body("用户都找到了");
    }

    public ServerResponse addUser(ServerRequest request) throws ServletException, IOException {
        User user = request.body(User.class); // 自动封装
        return ServerResponse.ok().body(user);
    }

    public ServerResponse updUser(ServerRequest request) throws ServletException, IOException {
        User user = request.body(User.class);
        user.setAge(10000).setName("老毕登");
        return ServerResponse.ok().body(user);
    }

    public ServerResponse delUser(ServerRequest request) {
        String id = request.pathVariable("id");
        return ServerResponse.ok().body("删除用户" + id + "成功");
    }
}
