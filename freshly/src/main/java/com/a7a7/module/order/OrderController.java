package com.a7a7.module.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

	@Autowired
	OrderService service;
	
	// 모바일 주문 리스트 화면 입니다.
	@RequestMapping(value ="/mob/account/orderlist")
	public String moborderlist(Model model) {
		model.addAttribute("lists",service.selectOrderList());
		return "/mobile/account/orderlist";
	}
	
	// 앱 주문 리스트 화면 입니다.
	@RequestMapping(value ="/web/account/orderList")
	public String weborderlist(Model model) {
		model.addAttribute("lists",service.selectOrderList());
		return "/web/account/orderList";
	}
	
}
