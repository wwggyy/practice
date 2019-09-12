package com.valor.practice.controller;

import com.valor.practice.learn.annotation.MethodAop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试Controller
 * @Author valor.wang
 * Date  2019-04-05 23:14
 **/
@RestController
public class Home {
    @GetMapping("/home")
    @MethodAop("method1")
    public String method1(@RequestParam String hello){
        return hello;
    }
}
