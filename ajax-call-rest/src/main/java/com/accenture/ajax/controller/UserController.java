package com.accenture.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

//  http://localhost:8090/getuserinformation
	@RequestMapping("getuserinformation")
	public String getuserInfo(){
		return "userinfo";
	}
}
