package com.heman.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }

//    @Rest
//    @RequestMapping("/hello")
//    public String hello() {
//        return "Hello!!!!!!!!";
//    }


//    @RequestMapping("/error")
//    public String error() {
//        return "Hello!!!!!!!!";
//    }
}
