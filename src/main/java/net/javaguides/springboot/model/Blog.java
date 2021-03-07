package net.javaguides.springboot.model;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

@Entity
@Table(name =  "blog")
public class Blog {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "posts")
	private String post;

	@Column(name = "user_id")
	private Long user_id;

	
	public Blog() {
		
	}

	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Blog(long user_id,String post) {
		super();
		this.user_id=user_id;
		this.post = post;

	}

	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
}
