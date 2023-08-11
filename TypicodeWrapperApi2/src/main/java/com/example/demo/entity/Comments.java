package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comments {
	private int id;
	private int postId;
	private String name;
	private String email;
	private String body;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	public Comments(int id, int postId, String name, String email, String body) {
		super();
		this.id = id;
		this.postId = postId;
		this.name = name;
		this.email = email;
		this.body = body;
	}
	
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Comments [id=" + id + ", postId=" + postId + ", name=" + name + ", email=" + email + ", body=" + body
				+ "]";
	}
	
	
	
	
}
