package com.natanael.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("home")
	public String DemoPage(){
		
		return "Demo.jsp";
	}
}
