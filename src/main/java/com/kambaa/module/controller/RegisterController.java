package com.kambaa.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kambaa.module.entity.registerEntity;

@Controller
public class RegisterController {
	@RequestMapping("register")
	public String viewRegister(Model model) {
		registerEntity register=new registerEntity();
		model.addAttribute("register",register);
		return "register";
	}
	
	@PostMapping("register")
	public String submitRegister(@ModelAttribute("register") registerEntity register) {
		System.out.println("..............Ready.............");
		System.out.println(register.getName());
		System.out.println(register.getMoblieNumber());
		System.out.println(register.getMobilePin());
		System.out.println(".......End........");
		return "register";
	}
}
