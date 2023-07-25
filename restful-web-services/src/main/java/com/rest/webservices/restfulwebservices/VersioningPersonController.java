package com.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2("Bob", "Charlie");
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonRequestParameter() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVersionOfPersonRequestParameter() {
		return new PersonV2("Bob", "Charlie");
	}
	
	@GetMapping(path = "/person", headers = "x-api-version=1")
	public PersonV1 getFirstVersionOfPersonRequestHeaders() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person", headers = "x-api-version=2")
	public PersonV2 getSecondVersionOfPersonRequestHeaders() {
		return new PersonV2("Bob", "Charlie");
	}
	
	
}
