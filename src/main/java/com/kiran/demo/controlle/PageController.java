package com.kiran.demo.controlle;

import com.kiran.demo.forms.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {
    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }
   @RequestMapping("/home")
    public String home(Model model) {
       System.out.println("home page handler");
       model.addAttribute("name","My name is kiran Ghale");
       model.addAttribute("github", "https://github.com/kirannjr11");
        return "home";
    }

    //about
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("About page loading");
        return "about";
    }

    //services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading");
        return "services";
    }

    //contact
    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    //login
    @GetMapping("/login")
    public String login() {
        System.out.println("this is form login");
        return "login";
    }

    //register
    @GetMapping("/register")
    public String register(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);
        return "register";
    }

    @RequestMapping(value="/do-register", method = RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm) {
        return "redirect:/register";
    }



}
