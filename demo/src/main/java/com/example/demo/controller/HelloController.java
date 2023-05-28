package com.example.demo.controller;

import com.example.demo.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 请求处理类
@RestController
public class HelloController {
    //简单方法
    @RequestMapping("/simpleParam")
    public String simpleParam(String name, Integer age) {
        System.out.println(name + age);
        return name + age;
    }

    // 实体方法
    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return user.toString();
    }
}
