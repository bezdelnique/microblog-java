package com.heman.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Model theModel) {
        theModel.addAttribute("theDate", new java.util.Date());
        theModel.addAttribute("title", "Hello");
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "hello2";
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
