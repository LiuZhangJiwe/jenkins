package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhuan
 * @Date 2020/12/6 17:17
 */
@RestController
@RequestMapping("/demo")
public class DemoConller {
    @RequestMapping("/test")
    public String test(){
        return "测试jenkins555!";
    }
}
