package com.college.academic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="/test/home")
	public void testHome(){
		System.out.println("Home test api...............");
	}
	
}
