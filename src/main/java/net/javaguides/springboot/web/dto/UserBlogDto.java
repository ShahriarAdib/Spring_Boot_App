package net.javaguides.springboot.web.dto;

public class UserBlogDto {
	
	private long user_id;
	private String content;

	  public UserBlogDto(long user_id,String content) {
		super();
		this.user_id = user_id;
		this.content = content;
	}

	public UserBlogDto() {
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getContent() {
	    return content;
	  }

	  public void setContent(String content) {
	    this.content = content;
	  }

}

