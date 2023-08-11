package com.example.demo.contollertest;

import com.example.demo.controller.TypicodeController;
import com.example.demo.entity.Posts;
import com.example.demo.httpclientservice.TypicodeClientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class ControllerTest {

	@Mock
	private TypicodeClientService client;

	@InjectMocks
	private TypicodeController typicodeController;

	private MockMvc mockMvc;
	private ObjectMapper objectMapper;

	@BeforeEach
	void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(typicodeController).build();
		objectMapper = new ObjectMapper();
	}

	@Test
	void testGetAllPosts() throws Exception {


		List<Posts> posts = Arrays.asList(new Posts(1, 1, "Title 1", "Body 1"), new Posts(2, 1, "Title 2", "Body 2"));
		when(client.getAllPosts()).thenReturn(posts);

		mockMvc.perform(get("/wrapperapi/posts"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(objectMapper.writeValueAsString(posts)));

		verify(client, times(1)).getAllPosts();

		verifyNoMoreInteractions(client);
	}

	@Test
	void testGetPostById() throws Exception {
		
		Posts post = new Posts(1, 1, "Title", "Body");
		when(client.getPostById(1)).thenReturn(post);

		mockMvc.perform(get("/wrapperapi/posts/1"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(objectMapper.writeValueAsString(post)));

		verify(client, times(1)).getPostById(1);
		verifyNoMoreInteractions(client);
	}
	
	@Test
	void testCreatePost() throws Exception {
		
	    Posts createdPost = new Posts(1, 1, "New Title", "New Body");
	    when(client.createPost(any(Posts.class))).thenReturn(createdPost);

	    RequestBuilder requestBuilder = post("/wrapperapi/posts")
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(objectMapper.writeValueAsString(createdPost));

	    mockMvc.perform(requestBuilder)
	            .andExpect(status().isOk())
	            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
	            .andExpect(content().json(objectMapper.writeValueAsString(createdPost)));

	    verify(client, times(1)).createPost(any(Posts.class));
	    verifyNoMoreInteractions(client);
	}
	
	@Test
	void testDeletePost() throws Exception {

	    mockMvc.perform(delete("/wrapperapi/posts/1"))
	            .andExpect(status().isOk())
	            .andExpect(content().string("Post deleted successfully"));

	    verify(client, times(1)).deletePost(1);
	    verifyNoMoreInteractions(client);
	}



}
