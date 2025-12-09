package com.olivth.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping
    @GetMapping
        public String teste1(){return "Zeus, ur son has returned??";}

}