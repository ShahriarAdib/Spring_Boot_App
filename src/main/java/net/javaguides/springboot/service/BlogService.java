package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Blog;
import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springboot.web.dto.UserBlogDto;
import net.javaguides.springboot.web.dto.UserRegistrationDto;

public interface BlogService extends UserDetailsService{

	Blog save(UserBlogDto blogDto);

}
