package com.example.demo.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;

@Component
public class DummyData {

	@Autowired
	PostRepository postRepository;
	
	//@PostConstruct
	public void gerarPosts() {
		List<Post> posts = new ArrayList<>();
		
		Post p1 = new Post();
		p1.setAutor("Estevam");
		p1.setData(LocalDate.now());
		p1.setTitulo("Reiniciando o projeto do blog");
		p1.setTexto("Baixado direto do meu github???");
	
		Post p2 = new Post();
		p2.setAutor("Michelli");
		p2.setData(LocalDate.now());
		p2.setTitulo("Ta demorando muito pra postar novas aulas");
		p2.setTexto("Perdoável por conta da beleza");
		
		posts.add(p1);
		posts.add(p2);
		
		for (Post post : posts) {
		  Post retorno = postRepository.save(post);
		  System.out.println(retorno.getAutor() + " salvo no banco MySQL");
		}
	}
	
}
