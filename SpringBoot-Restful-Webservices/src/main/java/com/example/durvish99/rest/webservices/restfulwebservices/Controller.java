package com.example.durvish99.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@GetMapping(path="/init")
	public String init()
	{
		return("To Do Application");
	}
}
