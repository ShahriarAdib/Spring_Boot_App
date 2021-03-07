package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springboot.service.Blog;
import net.javaguides.springboot.web.dto.UserRegistrationDto;

@Controller
public class MainController{
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	
}

