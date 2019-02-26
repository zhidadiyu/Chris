package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class HelloController {
    @RequestMapping("/hello")

    //public String hello(){
    //    return "你好";
    //}
    public Map<String,String> hello(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("code","1");
        map.put("msg","hello world");
        return map;
    }

}
