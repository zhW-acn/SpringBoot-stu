package com.aca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/01/17
 */
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 定制请求授权规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/admin/**").hasRole("admin")
                .antMatchers("/user/**").hasRole("user")
                .antMatchers("/tourist/**").hasRole("tourist");

        // 开启自动配置的login页
        // /login来到登陆页
        // 登陆失败跳转到 /login?error
        http.formLogin();
        // 映射到自己的登录页
        // http.formLogin().loginPage("/login");


        // 开启自动配置的注销
        // 访问 /logout 表示用户退出
        // 注销成功返回/login?logout
        http.logout();
        // 注销成功后返回指定url
        // http.logout().logoutSuccessUrl("/");


        // rememberme功能
        http.rememberMe();
    }

    // 定制授权规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("u").password("u").roles("user")
                .and()
                .withUser("a").password("a").roles("admin")
                .and()
                .withUser("t").password("t").roles("tourist");
    }

}
