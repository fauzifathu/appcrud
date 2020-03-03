package com.crud.demo.springdatajpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Digunakan apabila ingin mengakses aplikasi via web

@Controller
public class AppController {

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }
}
