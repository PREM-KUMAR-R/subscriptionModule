package com.kambaa.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kambaa.module.entity.registerEntity;

@Controller
public class loginController {
	@RequestMapping("login")
	public String viewRegister(Model model) {
		registerEntity register=new registerEntity();
		model.addAttribute("login",register);
		return "login";
	}
	
	@PostMapping("login")
	public String submitRegister(@ModelAttribute("login") registerEntity register) {
		System.out.println("..............Ready.............");
		System.out.println(register.getName());
		System.out.println(register.getMoblieNumber());
		System.out.println(register.getMobilePin());
		System.out.println(".......End........");
		return "login";
	}
	
	@RequestMapping("home")
	public String viewHome(Model model){
		return "home";
	}
}
