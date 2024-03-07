package com.gol.spring.http.controller;

import com.gol.spring.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "user/login";
    }

    @PostMapping("/login")
    public String login(Model model, @ModelAttribute("login") LoginDto loginDto) {
//        return "forward:/WEB-INF/jsp/user/login.jsp";
//        return "redirect:https://google.com";
        return "redirect:/login";
    }

//    @PostMapping("/login")
//    public String login(Model model, @ModelAttribute("login") LoginDto loginDto) {
//        return "user/login";
//    }


}
