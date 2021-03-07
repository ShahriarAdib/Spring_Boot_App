package net.javaguides.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springboot.web.dto.UserBlogDto;
import net.javaguides.springboot.web.dto.UserRegistrationDto;

public interface Blog extends UserDetailsService{

	Blog save(UserBlogDto blogDto);

}
