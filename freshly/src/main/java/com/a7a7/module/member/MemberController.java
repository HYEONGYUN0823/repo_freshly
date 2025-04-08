package com.a7a7.module.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;


@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	// 공통
	@ResponseBody
	@RequestMapping(value = "/loginProc")
	public Map<String, Object> loginProc(MemberDto dto, HttpSession httpSession) throws Exception {

		Map<String, Object> returnMap = new HashMap<String, Object>();
			
		// dto의 (email, password)와 DB의 (email, password)가 일치하는지 검사
		MemberDto result = service.loginChk(dto);
		
		// 검사결과 map에 put해서 리턴
		if(result != null) {
			httpSession.setAttribute("user", result);
			returnMap.put("rt", "success");
		} else {
			returnMap.put("rt", "fail");
		}

		return returnMap;
	}
	
	// Web
	@RequestMapping(value = "/web/login")
	public String webLogin() {
		
		return "web/sign/login";
	}
	
	//Moblie
	@RequestMapping(value = "/mob/login")
	public String mobLogin() {
		
		return "mobile/sign/login";
	}
	
}
