package net.javaguides.springboot.web;

import net.javaguides.springboot.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.service.Blog;
import net.javaguides.springboot.service.UserService;
import net.javaguides.springboot.web.dto.UserBlogDto;
import net.javaguides.springboot.web.dto.UserRegistrationDto;
import net.javaguides.springboot.web.dto.blog;


@Controller
@RequestMapping("/blog")
public class UserBlogController {
	
	//private UserService userService;
	private BlogService blogservice;

	public UserBlogController(BlogService blogservice) {
		super();
		this.blogservice = blogservice;
	}

	@ModelAttribute("blog")
    public UserBlogDto userblogDto() {
        return new UserBlogDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "blog";
	}
	

	@PostMapping
	public String blogUserAccount(@ModelAttribute("blog") UserBlogDto blogDto) {
		blogservice.save(blogDto);
		return "redirect:/blog?success";
	}
	
}

