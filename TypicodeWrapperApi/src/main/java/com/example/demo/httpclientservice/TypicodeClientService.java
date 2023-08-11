package com.example.demo.httpclientservice;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonStructure;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Albums;
import com.example.demo.entity.Comments;
import com.example.demo.entity.Photos;
import com.example.demo.entity.Posts;
import com.example.demo.entity.Todos;
import com.example.demo.entity.Users;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TypicodeClientService {
	private final String API_URL = "https://jsonplaceholder.typicode.com/";

	private HttpClient httpClient;
	private final ObjectMapper objectMapper;

	public TypicodeClientService() {
		this.httpClient = HttpClientBuilder.create().build();
		this.objectMapper = new ObjectMapper();
	}

	public List<Posts> getAllPosts() throws IOException {
		HttpGet request = new HttpGet(API_URL + "/posts");
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return Arrays.asList(objectMapper.readValue(content, Posts[].class));
	}
	
	public Posts getPostById(int postId) throws IOException {
		HttpGet request = new HttpGet(API_URL + "/posts/" + postId);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Posts.class);
	}

	public Posts createPost(Posts post) throws IOException {
		HttpPost request = new HttpPost(API_URL + "/posts");
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(post),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Posts.class);
	}

	public Posts updatePost(Posts post, int id) throws IOException {
		HttpPut request = new HttpPut(API_URL + "/posts/" + id);
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(post),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Posts.class);
	}

	public Posts deletePost(int id) throws IOException {
		HttpDelete request = new HttpDelete(API_URL + "/posts/" + id);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Posts.class);
	}

	public List<Albums> getAllAlbums() throws IOException {
		HttpGet request = new HttpGet(API_URL + "/albums");
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return Arrays.asList(objectMapper.readValue(content, Albums[].class));
	}

	public Albums getAlbumById(int albumId) throws IOException {
		HttpGet request = new HttpGet(API_URL + "/albums/" + albumId);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Albums.class);
	}

	public Albums createAlbum(Albums album) throws IOException {
		HttpPost request = new HttpPost(API_URL + "/albums");
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(album),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Albums.class);
	}

	public Albums updateAlbum(Albums album, int id) throws IOException {
		HttpPut request = new HttpPut(API_URL + "/albums/" + id);
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(album),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Albums.class);
	}

	public Albums deleteAlbum(int id) throws IOException {
		HttpDelete request = new HttpDelete(API_URL + "/albums/" + id);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Albums.class);
	}

	public List<Comments> getAllComments() throws IOException {
		HttpGet request = new HttpGet(API_URL + "/comments");
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return Arrays.asList(objectMapper.readValue(content, Comments[].class));
	}

	public Comments getCommentById(int commentId) throws IOException {
		HttpGet request = new HttpGet(API_URL + "/comments/" + commentId);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Comments.class);
	}

	public Comments createComment(Comments comment) throws IOException {
		HttpPost request = new HttpPost(API_URL + "/comments");
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(comment),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Comments.class);
	}

	public Comments updateComment(Comments comment, int id) throws IOException {
		HttpPut request = new HttpPut(API_URL + "/comments/" + id);
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(comment),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Comments.class);
	}

	public Comments deleteComment(int id) throws IOException {
		HttpDelete request = new HttpDelete(API_URL + "/comments/" + id);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Comments.class);
	}

	public List<Photos> getAllPhotos() throws IOException {
		HttpGet request = new HttpGet(API_URL + "/photos");
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return Arrays.asList(objectMapper.readValue(content, Photos[].class));
	}

	public Photos getPhotoById(int photoId) throws IOException {
		HttpGet request = new HttpGet(API_URL + "/photos/" + photoId);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Photos.class);
	}

	public Photos createPhoto(Photos photo) throws IOException {
		HttpPost request = new HttpPost(API_URL + "/photos");
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(photo),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Photos.class);
	}

	public Photos updatePhoto(Photos photo, int id) throws IOException {
		HttpPut request = new HttpPut(API_URL + "/photos/" + id);
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(photo),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Photos.class);
	}

	public Photos deletePhoto(int id) throws IOException {
		HttpDelete request = new HttpDelete(API_URL + "/photos/" + id);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Photos.class);
	}

	public List<Todos> getAllTodos() throws IOException {
		HttpGet request = new HttpGet(API_URL + "/todos");
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return Arrays.asList(objectMapper.readValue(content, Todos[].class));
	}

	public Todos getTodoById(int todoId) throws IOException {
		HttpGet request = new HttpGet(API_URL + "/todos/" + todoId);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Todos.class);
	}

	public Todos createTodo(Todos todo) throws IOException {
		HttpPost request = new HttpPost(API_URL + "/todos");
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(todo),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Todos.class);
	}

	public Todos updateTodo(Todos todo, int id) throws IOException {
		HttpPut request = new HttpPut(API_URL + "/todos/" + id);
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(todo),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Todos.class);
	}

	public Todos deleteTodo(int id) throws IOException {
		HttpDelete request = new HttpDelete(API_URL + "/todos/" + id);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Todos.class);
	}

	public List<Users> getAllUsers() throws IOException {
		HttpGet request = new HttpGet(API_URL + "/users");
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return Arrays.asList(objectMapper.readValue(content, Users[].class));
	}

	public Users getUserById(int userId) throws IOException {
		HttpGet request = new HttpGet(API_URL + "/users/" + userId);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Users.class);
	}

	public Users createUser(Users user) throws IOException {
		HttpPost request = new HttpPost(API_URL + "/users");
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(user),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Users.class);
	}

	public Users updateUser(Users user, int id) throws IOException {
		HttpPut request = new HttpPut(API_URL + "/users/" + id);
		StringEntity requestEntity = new StringEntity(objectMapper.writeValueAsString(user),
				ContentType.APPLICATION_JSON);
		request.setEntity(requestEntity);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Users.class);
	}

	public Users deleteUser(int id) throws IOException {
		HttpDelete request = new HttpDelete(API_URL + "/users/" + id);
		HttpResponse response = httpClient.execute(request);
		InputStream content = response.getEntity().getContent();
		return objectMapper.readValue(content, Users.class);
	}
}
