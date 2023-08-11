package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Albums;
import com.example.demo.entity.Comments;
import com.example.demo.entity.Photos;
import com.example.demo.entity.Posts;
import com.example.demo.entity.Todos;
import com.example.demo.entity.Users;
import com.example.demo.httpclientservice.TypicodeClientService;

@RestController
@RequestMapping("/wrapperapi")
public class TypicodeController {

	private final TypicodeClientService client;

	@Autowired
	public TypicodeController(TypicodeClientService client) {
		this.client = client;
	}

// METHODS FOR POSTS

	@GetMapping("/posts")
	public ResponseEntity<List<Posts>> getAllPosts() throws IOException {
		List<Posts> posts = client.getAllPosts();
		return new ResponseEntity<>(posts, HttpStatus.OK);
	}

	@GetMapping("/posts/{id}")
	public ResponseEntity<Posts> getPostById(@PathVariable int id) throws IOException {
		Posts post = client.getPostById(id);
		return new ResponseEntity<>(post, HttpStatus.OK);
	}

	@PostMapping("/posts")
	public ResponseEntity<Posts> createPost(@RequestBody Posts post) throws IOException {
		Posts createdPost = client.createPost(post);
		return new ResponseEntity<>(createdPost, HttpStatus.CREATED);
	}

	@PutMapping("/posts/{id}")
	public ResponseEntity<Posts> updatePost(@PathVariable int id, @RequestBody Posts post) throws IOException {
		Posts updatedPost = client.updatePost(post, id);
		return new ResponseEntity<>(updatedPost, HttpStatus.OK);
	}
	
	@DeleteMapping("/posts/{id}")
	public ResponseEntity<Posts> deletePost(@PathVariable int id) throws IOException {
		Posts deletedPost=client.deletePost(id);
		return new ResponseEntity<Posts>(deletedPost, HttpStatus.OK);
	}

// METHODS FOR ALBUMS

	@GetMapping("/albums")
	public ResponseEntity<List<Albums>> getAllAlbums() throws IOException {
		List<Albums> albums = client.getAllAlbums();
		return new ResponseEntity<>(albums, HttpStatus.OK);
	}

	@GetMapping("/albums/{id}")
	public ResponseEntity<Albums> getAlbumById(@PathVariable int id) throws IOException {
		Albums album = client.getAlbumById(id);
		return new ResponseEntity<>(album, HttpStatus.OK);
	}

	@PostMapping("/albums")
	public ResponseEntity<Albums> createAlbum(@RequestBody Albums album) throws IOException {
		Albums createdAlbum = client.createAlbum(album);
		return new ResponseEntity<>(createdAlbum, HttpStatus.CREATED);
	}

	@PutMapping("/albums/{id}")
	public ResponseEntity<Albums> updateAlbum(@PathVariable int id, @RequestBody Albums album) throws IOException {
		Albums updatedAlbum = client.updateAlbum(album, id);
		return new ResponseEntity<>(updatedAlbum, HttpStatus.OK);
	}

	@DeleteMapping("/albums/{id}")
	public ResponseEntity<Albums> deleteAlbum(@PathVariable int id) throws IOException {
		Albums deletedAlbum = client.deleteAlbum(id);
		return new ResponseEntity<Albums>(deletedAlbum, HttpStatus.OK);
	}

// METHODS FOR COMMENTS

	@GetMapping("/comments")
	public ResponseEntity<List<Comments>> getAllComments() throws IOException {
		List<Comments> comments = client.getAllComments();
		return new ResponseEntity<>(comments, HttpStatus.OK);
	}

	@GetMapping("/comments/{id}")
	public ResponseEntity<Comments> getCommentById(@PathVariable int id) throws IOException {
		Comments comment = client.getCommentById(id);
		return new ResponseEntity<>(comment, HttpStatus.OK);
	}

	@PostMapping("/comments")
	public ResponseEntity<Comments> createComment(@RequestBody Comments comment) throws IOException {
		Comments createdComment = client.createComment(comment);
		return new ResponseEntity<>(createdComment, HttpStatus.CREATED);
	}

	@PutMapping("/comments/{id}")
	public ResponseEntity<Comments> updateComment(@PathVariable int id, @RequestBody Comments comment)
			throws IOException {
		Comments updatedComment = client.updateComment(comment, id);
		return new ResponseEntity<>(updatedComment, HttpStatus.OK);
	}

	@DeleteMapping("/comments/{id}")
	public ResponseEntity<Comments> deleteComment(@PathVariable int id) throws IOException {
		Comments deletedComment = client.deleteComment(id);
		return new ResponseEntity<Comments>(deletedComment, HttpStatus.OK);
	}

	// METHODS FOR PHOTOS

	@GetMapping("/photos")
	public ResponseEntity<List<Photos>> getAllPhotos() throws IOException {
		List<Photos> photos = client.getAllPhotos();
		return new ResponseEntity<>(photos, HttpStatus.OK);
	}

	@GetMapping("/photos/{id}")
	public ResponseEntity<Photos> getPhotoById(@PathVariable int id) throws IOException {
		Photos photo = client.getPhotoById(id);
		return new ResponseEntity<>(photo, HttpStatus.OK);
	}

	@PostMapping("/photos")
	public ResponseEntity<Photos> createPhoto(@RequestBody Photos photo) throws IOException {
		Photos createdPhoto = client.createPhoto(photo);
		return new ResponseEntity<>(createdPhoto, HttpStatus.CREATED);
	}

	@PutMapping("/photos/{id}")
	public ResponseEntity<Photos> updatePhoto(@PathVariable int id, @RequestBody Photos photo) throws IOException {
		Photos updatedPhoto = client.updatePhoto(photo, id);
		return new ResponseEntity<>(updatedPhoto, HttpStatus.OK);
	}

	@DeleteMapping("/photos/{id}")
	public ResponseEntity<Photos> deletePhoto(@PathVariable int id) throws IOException {
		Photos deletedPhoto = client.deletePhoto(id);
		return new ResponseEntity<Photos>(deletedPhoto, HttpStatus.OK);
	}

	// METHODS FOR TODOS

	@GetMapping("/todos")
	public ResponseEntity<List<Todos>> getAllTodos() throws IOException {
		List<Todos> todos = client.getAllTodos();
		return new ResponseEntity<>(todos, HttpStatus.OK);
	}

	@GetMapping("/todos/{id}")
	public ResponseEntity<Todos> getTodoById(@PathVariable int id) throws IOException {
		Todos todo = client.getTodoById(id);
		return new ResponseEntity<>(todo, HttpStatus.OK);
	}

	@PostMapping("/todos")
	public ResponseEntity<Todos> createTodo(@RequestBody Todos todo) throws IOException {
		Todos createdTodo = client.createTodo(todo);
		return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
	}

	@PutMapping("/todos/{id}")
	public ResponseEntity<Todos> updateTodo(@PathVariable int id, @RequestBody Todos todo) throws IOException {
		Todos updatedTodo = client.updateTodo(todo, id);
		return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
	}

	@DeleteMapping("/todos/{id}")
	public ResponseEntity<Todos> deleteTodo(@PathVariable int id) throws IOException {
		Todos deletedTodo = client.deleteTodo(id);
		return new ResponseEntity<Todos>(deletedTodo, HttpStatus.OK);
	}

	// METHODS FOR USERS

	@GetMapping("/users")
	public ResponseEntity<List<Users>> getAllUsers() throws IOException {
		List<Users> users = client.getAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable int id) throws IOException {
		Users user = client.getUserById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<Users> createUser(@RequestBody Users user) throws IOException {
		Users createdUser = client.createUser(user);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}

	@PutMapping("/users/{id}")
	public ResponseEntity<Users> updateUser(@PathVariable int id, @RequestBody Users user) throws IOException {
		Users updatedUser = client.updateUser(user, id);
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<Users> deleteUser(@PathVariable int id) throws IOException {
		Users deletedUser = client.deleteUser(id);
		return new ResponseEntity<Users>(deletedUser, HttpStatus.OK);
	}

}
