package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;

@Controller
public class PostController {

	@Autowired
	PostService postService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPost() {
		ModelAndView mv = new ModelAndView("postsblog");
		List<Post> posts = postService.findAll();
		mv.addObject("meus_posts", posts);
		return mv;
	}
	
}
