package com.jobaram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jobaram.service.JobAramService;

@Controller
public class IndexController {
	
	@Autowired
	JobAramService jobAramService;
	
	
	@RequestMapping (value = {"/main"} )
	public String main() {
		return "index";
	}
	
	@RequestMapping (value = {"/"} )
	public String index() {
		return "redirect:main";
	}
	
	@ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/getStudentInfo")
    public Object getStudentInfo(){
		return this.jobAramService.getStudentInfo();
    }
	

}