package com.jobaram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping (value = {"/main"} )
	public String main() {
		return "index";
	}
	
	@RequestMapping (value = {"/"} )
	public String index() {
		return "redirect:main";
	}

}