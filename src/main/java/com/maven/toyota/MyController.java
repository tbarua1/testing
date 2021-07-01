package com.maven.toyota;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   // annotation 
public class MyController {
	@RequestMapping("/")
	public  String homePage() {
		return "home";
	}
}
