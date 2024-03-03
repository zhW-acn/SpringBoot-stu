package com.aca.controller;

import com.aca.entry.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/03
 */
@Tag(name = "name：用户",description = "description：用户的crud")
@RestController
public class UserController {
    @Operation(summary = "summary：按照id查询用户",description = "description：按照id查询用户")
    @GetMapping("/user/{id}")
    public Object getUser(@PathVariable("id") int id) {
        return new User(id, "aca", 18);
    }

    @GetMapping("/users")
    public Object getUsers() {
        return "用户都找到了";
    }

    @PostMapping("/user")
    public Object addUser(User user) {
        return user;
    }

    @PutMapping("/user")
    public Object updUser(User user) {
        user.setAge(10000).setName("老毕登");
        return user;
    }

    @DeleteMapping("/user/{id}")
    public Object delUser(@PathVariable("id") int id) {
        return "删除用户" + id + "成功";
    }
}
