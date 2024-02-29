package com.aca.config;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/02/28
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(@Nonnull ResourceHandlerRegistry registry) {
        // 保留原配置
        WebMvcConfigurer.super.addResourceHandlers(registry);

        // 自定义
        // 添加路径匹配：/static/ 下的所有请求可以去 /public/ 文件夹下找
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/public/");

    }
}
