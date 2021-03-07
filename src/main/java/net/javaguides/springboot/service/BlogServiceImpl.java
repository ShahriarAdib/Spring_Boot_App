package net.javaguides.springboot.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.model.Blog;

import net.javaguides.springboot.repository.BlogRepository;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.web.dto.UserBlogDto;

@Service
public class BlogServiceImpl implements BlogService{

	private BlogRepository blogRepository;


	public BlogServiceImpl(BlogRepository blogRepository) {
		super();
		this.blogRepository = blogRepository;
	}

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blog save(UserBlogDto blogDto) {
		// TODO Auto-generated method stub
		Blog blog = new Blog(blogDto.getUser_id(),blogDto.getContent());
		
		return blogRepository.save(blog);
		
	}
	
	

}
