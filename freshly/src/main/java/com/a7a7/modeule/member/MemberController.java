package com.a7a7.modeule.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/web/login")
	public String webLogin() {
		
		return "web/sign/login";
	}
	
	@RequestMapping(value = "/mob/login")
	public String mobLogin() {
		
		return "mobile/sign/login";
	}
	
}
