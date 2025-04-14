package com.a7a7.module.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.a7a7.module.basic.BasicDto;
import com.a7a7.module.basic.BasicVo;

import jakarta.servlet.http.HttpSession;



@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	// 공통
	// 로그인 ID 중복검사
	@ResponseBody
	@RequestMapping(value = "/idChk")
	public Map<String, Object> idChk(MemberDto dto) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		// id 중복검사
		int result = service.idChk(dto);
		
		// 검사결과 map에 put해서 리턴
		if(result == 0 && dto.getMbId() != "") {
			returnMap.put("rt", "success");
		} else {
			returnMap.put("rt", "fail");
		}
		
		return returnMap;
	}
	
	// Web
	// 로그인 화면
	@RequestMapping(value = "/web/login")
	public String webLogin() {
		
		return "web/sign/login";
	}
	// 로그인 회원일치 검사
	@ResponseBody
	@RequestMapping(value = "/web/loginProc")
	public Map<String, Object> webLoginProc(MemberDto dto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		// dto의 (email, password)와 DB의 (email, password)가 일치하는지 검사
		MemberDto result = service.loginChk(dto);
		
		// 검사결과 map에 put해서 리턴
		if(result != null) {
			httpSession.setAttribute("webUser", result);
			returnMap.put("rt", "success");
		} else {
			returnMap.put("rt", "fail");
		}

		return returnMap;
	}
	// 로그아웃
	@ResponseBody
	@RequestMapping(value = "/web/logoutProc")
	public Map<String, Object> webLogoutProc(HttpSession httpSession) throws Exception {
		
		Map<String, Object> returnMap = new HashMap<String, Object>();
			
		httpSession.setAttribute("webUser", null);
		returnMap.put("rt", "success");
		
		return returnMap;
	}
	
	// Mobile
	// 로그인 화면
	@RequestMapping(value = "/mob/login")
	public String mobLogin() {
		return "mobile/sign/login";
	}
	// 로그인 회원일치 검사
	@ResponseBody
	@RequestMapping(value = "/mob/loginProc")
	public Map<String, Object> mobLoginProc(MemberDto dto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		// dto의 (email, password)와 DB의 (email, password)가 일치하는지 검사
		MemberDto result = service.loginChk(dto);
		
		// 검사결과 map에 put해서 리턴
		if(result != null) {
			httpSession.setAttribute("mobUser", result);
			returnMap.put("rt", "success");
		} else {
			returnMap.put("rt", "fail");
		}

		return returnMap;
	}
	// 로그아웃
	@ResponseBody
	@RequestMapping(value = "/mob/logoutProc")
	public Map<String, Object> mobLogoutProc(HttpSession httpSession) throws Exception {
		
		Map<String, Object> returnMap = new HashMap<String, Object>();
			
		httpSession.setAttribute("mobUser", null);
		returnMap.put("rt", "success");
		
		return returnMap;
	}
	
	
	
	// ##############    WEB화면 ###########################
	
	@RequestMapping(value ="/web/basic/memberList")
	public String selectWebmemberList(Model model) {
		model.addAttribute("list", service.selectMemberList());
		return "web/basic/memberList";
	}
	
	@RequestMapping(value = "/web/basic/memberForm")
	public String selectWebmemberForm(@ModelAttribute("vo") BasicVo vo, MemberDto dto,Model model) {
		//insert
		if(vo.getSeq().equals("0") || vo.getSeq().equals(" ")) {	
		}// update
		else {
			model.addAttribute("item", service.selectMemberView(dto));
		}
		return "web/basic/memberForm";
	}
	
	
}
