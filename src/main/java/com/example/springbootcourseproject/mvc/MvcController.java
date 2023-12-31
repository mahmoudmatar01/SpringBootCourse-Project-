package com.example.springbootcourseproject.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MvcController {
    @RequestMapping(value = "/mvcEndPoint", method = RequestMethod.GET)
    public ModelAndView handleRequest() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Hello, Spring MVC!");
        modelAndView.setViewName("myView");
        return modelAndView;
    }
}