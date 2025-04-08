package com.a7a7.module.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	// 공통
	@ResponseBody
	@RequestMapping(value = "/loginProc")
	public String loginProc() {
		
		return "web/sign/login";
	}
	
	// Web
	@RequestMapping(value = "/web/login")
	public String webLogin() {
		
		return "web/sign/login";
	}
	
	// Mobile
	@RequestMapping(value = "/mob/login")
	public String mobLogin() {
		
		return "mobile/sign/login";
	}
	
}
