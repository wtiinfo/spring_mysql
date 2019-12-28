package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Post;

public interface PostService {
	
	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);

}
