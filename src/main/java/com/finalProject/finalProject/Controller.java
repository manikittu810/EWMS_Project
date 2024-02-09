package com.finalProject.finalProject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping(value="/home",method= RequestMethod.GET)
public class Controller {
    public String home(Model model){
        model.addAttribute("message","Hello Farmer !! Welcome Back!!");
        return "home";
    }
}