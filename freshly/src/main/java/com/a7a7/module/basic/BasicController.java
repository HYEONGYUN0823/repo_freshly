package com.a7a7.module.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BasicController {
	
	@Autowired
	BasicService service;
	
	// 식료품 관리
	// 식료품 list 화면
	@RequestMapping(value = "/web/basicGroceryList")
	public String selectBasicGroceryList(Model model) {
		
		model.addAttribute("list", service.selectGroceryList());
		
		return "web/basic/basicGroceryList";
	}
	
	// 거래처 관리
	// 거래처 list 화면
	@RequestMapping(value = "/web/basicAccountList")
	public String selectBasicAccountList(Model model) {
		
		model.addAttribute("list", service.selectAccountList());
		
		return "web/basic/basicAccountList";
	}
	
	// 공장 관리
	// 공장 list 화면
	@RequestMapping(value = "/web/basicFactoryList")
	public String selectBasicFactoryList(Model model) {
		
		model.addAttribute("list", service.selectFactoryList());
		
		return "web/basic/basicFactoryList";
	}
	
}
