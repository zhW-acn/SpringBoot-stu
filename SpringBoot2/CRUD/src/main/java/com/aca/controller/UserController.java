package com.aca.controller;

import com.aca.entry.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.*;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/01/15
 */
@Controller
public class UserController {

    @GetMapping("/users")
    public String toUserList() {
        return "user/list";
    }

    @GetMapping("/user")
    public String toAddPage() {
        return "user/add";
    }

    // 添加User
    @PostMapping("/user")
    // SpringMVC将请求参数和入参对象属性一一绑定
    // 要求请求参数名字和入参属性名一一对应【input的name属性】
    public String addUser(User user) {
        String path = "F:\\GitHub\\SpringBoot-stu\\CRUD\\src\\main\\resources\\static\\user.json";
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int currentChar;
            int previousChar = -1;

            while ((currentChar = br.read()) != -1) {
                if (previousChar != -1) {
                    content.append((char) previousChar);
                }
                previousChar = currentChar;
            }
        } catch (IOException e) {
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            content.append(",{\"username\": \"").append(user.getUsername()).append("\",\"age\": ").append(user.getAge()).append("}]");
            bw.write(content.toString());
        } catch (IOException e) {
        }
        // 重定向到userList
        return "redirect:/users";
    }

    // 修改页面数据回显
    @GetMapping("/user/{id}")
    public String toUpdPage(@PathVariable String id){
        // 懒得连数据库了
        return "";
    }

    // 修改
    @PutMapping("/user")
    public String updUser(){
        return "redirect:/users";
    }

    @DeleteMapping("/user/{id}")
    public String delUser(@PathVariable String id){
        return "redirect:/users";
    }
}
