package com.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("hello kotireddy how are you ph 9553144617")
	public String doSomething(){
		return "Hello World!!!";
	}
}
