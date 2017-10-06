package com.code.MVC_1.controllers;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.MVC_1.model.User;


@Controller
//@RequestMapping("/signup")
public class signUp {
	private static Log log = LogFactory.getLog(signUp.class);
	@GetMapping("/signup")
	//@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String SignUp() {
		return "/signup";
	}

	//using request parameter annotation with map
	/*@PostMapping("/signup")
	//@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String doSignUp(@RequestParam Map<String, String> parms, Model model) {
		String name = parms.get("name");
		String email = parms.get("email");
		String password = parms.get("password");
		model.addAllAttributes(parms);
		log.info("name:"+name+"email:"+email+"password:"+password);
		return "redirect:/";
	}*/
	
	//using model object called user
	@PostMapping("/signup")
	public String dosignup(@Validated User user,BindingResult result){
		if(result.hasErrors()){
			return "/signup";
		}
		log.info("name:"+user.getName()+"email:"+user.getEmail()+"password:"+user.getPassword());
		return "redirect:/";
	}
}
