package br.com.Courses.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "HELLO WORLD";
	}
	
}
