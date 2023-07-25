package com.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.webservices.restfulwebservices.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
