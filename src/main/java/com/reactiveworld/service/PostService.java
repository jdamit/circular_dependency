package com.reactiveworld.service;

import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	private CommentService commentService;

	public PostService(CommentService commentService) {
		super();
		this.commentService = commentService;
	}

}
