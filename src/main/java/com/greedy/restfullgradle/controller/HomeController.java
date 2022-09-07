package com.greedy.restfullgradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Controller +  responseBody 이다.
@RequestMapping("/")
//해당 컨트롤러의 루트 설정
public class HomeController {

    @GetMapping("")
    //루트로 접속했을 때 메소드를 실행시킬 수 있다.
    public String test(){
        return "test!!";
    }
}
