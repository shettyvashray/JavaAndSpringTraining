package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Albums {
	private int id;
	private int userId;
	private String title;
	private List<Photos> photos;
	
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
	
	public List<Photos> getPhotos() {
		return photos;
	}
	
	public void setPhotos(List<Photos> photos) {
		this.photos = photos;
	}
	
	public Albums(int id, int userId, String title, List<Photos> photos) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.photos = photos;
	}
	
	
	public Albums() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
