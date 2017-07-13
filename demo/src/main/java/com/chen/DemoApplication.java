package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class DemoApplication {
	  
	@RequestMapping("/hello")
    String home() {
        return "Hello ,spring boot!";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}


