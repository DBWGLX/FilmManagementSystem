package com.wyx.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//表示这是一个配置类，会被 Spring 容器管理。类中定义的 Bean 和方法会被自动配置在应用程序上下文中。
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {//配置 CORS 规则。
        registry.addMapping("/api/**")//定义哪些 URL 路径允许跨域访问
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}
