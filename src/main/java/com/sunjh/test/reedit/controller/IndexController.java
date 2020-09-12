package com.sunjh.test.reedit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjh
 * @date 2020/6/26 11:51
 */
@RestController
public class IndexController {
    @GetMapping("/api/test")
    public String hello(){
        System.out.println("qweqwe");
        return "index";
    }
}
