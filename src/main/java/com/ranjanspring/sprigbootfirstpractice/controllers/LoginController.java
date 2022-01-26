package com.ranjanspring.sprigbootfirstpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String welcome() {
		return "welcome";  // Call to .JSP template
	}
	@RequestMapping("/login")
//	@ResponseBody
	public String login() {
		return "login";  // Call to .JSP template
	}
	
	
	
	@RequestMapping("/register")
	public String register() {
		return "register";  // Call to .JSP template
	}
}
