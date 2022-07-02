package com.nanna.springboot.controller;


//import com.sun.tools.javac.jvm.Gen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld() {
        System.out.println("Welcome to Nanna Site ");
        System.out.println("nanna");
        System.out.println("Hey Man  nanna here ");
        return "nanna dash";
    }
    public String nannaDashMethod(String nanna) {
        return nanna +23;
    }
}
