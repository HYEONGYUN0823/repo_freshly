package com.a7a7.module.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/web/")
	public String indexWeb(Model model, HttpSession httpSession) {
		
		// login 검사
		if(httpSession.getAttribute("user") == null) {
			return "redirect:/web/login";
		}
		model.addAttribute("user", httpSession.getAttribute("user"));
		
		return "web/index/index";
	}
	
	@RequestMapping(value = "/mob/")
	public String indexMob(Model model, HttpSession httpSession) {
		
		// login 검사
		if(httpSession.getAttribute("user") == null) {
			return "redirect:/mob/login";
		}
		model.addAttribute("user", httpSession.getAttribute("user"));
		
		return "mobile/index/index";
	}
}
