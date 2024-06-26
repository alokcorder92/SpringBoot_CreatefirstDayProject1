package com.example.demo.text;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/display") 
public class webcontroller {
	
	@GetMapping("/about")
	public String getabout() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String getcontact() {
		return "contact";
	}

}
