package com.a7a7.module.ordering;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderingController {
	@Autowired
	OrderingService service;
	
	// 모바일 공장 발주관리
	@RequestMapping(value ="/mob/factory/OrderingList")
	public String mobOrderingList(Model model) {
		model.addAttribute("list", service.selectList());
		return "mobile/factory/OrderingList";
	}
	
	// 웹 공장 발주관리
	@RequestMapping(value ="/web/factory/OrderingList")
	public String webOrderingList(Model model) {
		model.addAttribute("list", service.selectList());
		return "web/factory/OrderingList";
	}
	
	@RequestMapping(value = "/web/factory/OrderingForm")
	public String webOrderingForm() {
		
		return "web/factory/OrderingForm";
	}
	
	
	@RequestMapping(value = "web/factory/OrderingInst")
	public String orderingInst(OrderingDto dto) {
		service.insert(dto);
		
		return "redirect:/web/factory/OrderingList";
	}
	
	
}
