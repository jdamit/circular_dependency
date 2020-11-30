package com.reactiveworld.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

	private PostService postService;

	public CommentService(@Lazy PostService postService) {
		super();
		this.postService = postService;
	}
	
}
