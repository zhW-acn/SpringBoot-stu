package com.aca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/01/14
 */
@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model,
                        HttpSession session) {
        if (!StringUtils.isEmpty(username) && "a".equals(password)) {
            // 登陆成功，存入session
            session.setAttribute("loginUser", username);
            return "redirect:/loginSuccess";
        } else {
            // 登陆失败
            model.addAttribute("msg", "登陆失败");
            return "index";
        }
    }
}
