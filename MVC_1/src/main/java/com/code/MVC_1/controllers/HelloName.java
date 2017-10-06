package com.code.MVC_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.MVC_1.utils.MyUtils;

@Controller
public class HelloName {

	@RequestMapping("/home")
	public String Hello(Model model){
		model.addAttribute("name",MyUtils.getmessage("name",null));
		model.addAttribute("text",MyUtils.getmessage("text", "http://below18.example.com","http://above18.example.com"));
		return "home";
	}
}
