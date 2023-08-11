package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Posts {
	private int id;
	private int userId;
	private String title;
	private String body;
	private List<Comments> comments;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	public List<Comments> getComments() {
		return comments;
	}
	
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	
//	public Posts(int id, int userId, String title, String body) {
//		super();
//		this.id = id;
//		this.userId = userId;
//		this.title = title;
//		this.body = body;
//	}
	
	public Posts(int id, int userId, String title, String body, List<Comments> comments) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.body = body;
		this.comments = comments;
	}
	
	public Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public String toString() {
//		return "Posts [id=" + id + ", userId=" + userId + ", title=" + title + ", body=" + body + "]";
//	}
	@Override
	public String toString() {
		return "Posts [id=" + id + ", userId=" + userId + ", title=" + title + ", body=" + body + ", comments="
				+ comments + "]";
	}
	
	
}
