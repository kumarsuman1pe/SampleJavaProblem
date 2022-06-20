package com.rest.webService.restfulwebService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webService.Bean.HelloWorldBean;

@RestController
public class HelloWorldController {
	@GetMapping(path = "/hello-world")
	public String greet() {
		return "Hello-World";
	}

	/**
	 * JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration
	 *
	 * is used to convert bean to the JSON
	 * 
	 * @return
	 */
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean getHelloWorld() {
		return new HelloWorldBean("Hey! Hello-world bean");
	}

	@GetMapping(path = "/hello-world/pathVariable/{name}")
	public String pathVariable(@PathVariable  String name) {
		return String.format("hello-world, %s", name);
	}

}
