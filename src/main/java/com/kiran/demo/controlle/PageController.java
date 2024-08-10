package com.kiran.demo.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller

public class PageController {
   @RequestMapping("/home")
    public String home(Model model) {
       System.out.println("home page handler");
       model.addAttribute("name","My name is kiran Ghale");
       model.addAttribute("github", "https://github.com/kirannjr11");
        return "home";
    }

}
