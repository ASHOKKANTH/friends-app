package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFrnds {
@GetMapping
	public String myFrnds() {
		
		return "best friends forever(sreenu,bathi,ashok)";
	}
}
