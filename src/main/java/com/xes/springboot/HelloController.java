package com.xes.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuweishi on 2017/8/18.
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String say(){
        return "hello world";
    }
}
