package com.sj.summer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummerController {
    @RequestMapping("/s")
    public String summer(){
        return "我是Summer主模块";
    }
}
