package org.nilkanth.learning.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialGreeting {
	
	@RequestMapping("/hello")
	private String greet() {
		return "Hi Chirag!";
	}
	
}
