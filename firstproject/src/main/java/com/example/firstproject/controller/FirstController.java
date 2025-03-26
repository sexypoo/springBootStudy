package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 이 클래스가 컨트롤러임을 선언

public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        //model 객체가 '고은'값을 'username'에 연결해 웹 브라우저로 보냄
        model.addAttribute("username","goeun");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","박고은");
        return "goodbye";
    }
}

