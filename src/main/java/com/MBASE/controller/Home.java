package com.MBASE.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {
	
	@RequestMapping("/home")
	public String welcome() {
		return "Jenkins pipeline config script";
	}

}
