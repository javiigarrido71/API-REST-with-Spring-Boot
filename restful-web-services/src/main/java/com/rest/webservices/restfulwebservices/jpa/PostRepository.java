package com.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.restfulwebservices.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
	
}
