package com.rest.webservices.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//Authentication
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		
		//Basic Authentication
		http.httpBasic(withDefaults());
		
		//Allow POST AND PUT requests
		http.csrf(security -> security.disable());
		
		return http.build();
	}
}
