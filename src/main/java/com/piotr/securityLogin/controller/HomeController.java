package com.piotr.securityLogin.controller;

import com.piotr.securityLogin.model.Role;
import com.piotr.securityLogin.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model, Principal principal) {
        model.addAttribute("principal",principal);
        return "home";
    }


}
