package com.milky.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @GetMapping("/api/users")
    public List<Object> selectMemberList(@RequestBody List<String> req){

        return null;
    }

    @PostMapping("/api/join")
    public String test2(){
        return null;
    }

}
