package com.cameo.spb01.controller;

import com.cameo.spb01.properties.MyProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    MyProperties pro;

    @GetMapping("/test")
    public String test(){return "Hello SprintBoot1!";}

    @Value("${picPath}")
    private String picPath;


    @GetMapping("/picPath")
    public String picPath(){return picPath;}

    @GetMapping("/pro")
    public MyProperties pro(){return pro;}

}
