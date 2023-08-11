package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Todos {
	private int id;
	private int userId;
	private String title;
	private boolean completed;
	
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
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	public Todos(int id, int userId, String title, boolean completed) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.completed = completed;
	}
	
	public Todos() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Todos [id=" + id + ", userId=" + userId + ", title=" + title + ", completed=" + completed + "]";
	}	
}
