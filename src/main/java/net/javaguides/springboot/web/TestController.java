package net.javaguides.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.service.UserService;
import net.javaguides.springboot.web.dto.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
@Controller
public class TestController {

	@GetMapping("/test")
	public String test() {
		//model.addAttribute("name", name);
		return "test";
	}

}
*/


@Controller
public class TestController {
	
	private UserService userService;
	
	public TestController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/test")
	public String testForm(Model model) {
		model.addAttribute("test", new test());
		return "test";
	}

	@PostMapping("/test")
	public String testSubmit(@ModelAttribute test test, Model model) {
		model.addAttribute("test", test);
		return "testview";
	}

}
