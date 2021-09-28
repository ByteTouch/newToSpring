package com.example.myproject.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  // RESTful APIを提供するController
@RequestMapping("/hello")  // このControllerのrootを提示する
public class HelloController {
    
    @GetMapping  // Http Getを処理する
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/bye")  // メソッド層のパスはclass層のパスの後ろに追加する
    public String bye() {
        return "Good Bye!";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/ohayo")  // この書き方も正しいですが、より読みにくい
    public String ohayo() {
        return "Ohayo!";
    }
}
