package com.whut.edu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.whut.edu.HelloWorld
 * @description: TODO
 * @author: DZX
 * @create: 2021-11-10 8:52
 */
@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
    @RequestMapping("/int")
    public int sayInt(){
        return 1;
    }
    @RequestMapping("/china")
    public String say(){
        return "你好！中国";
    }
}
