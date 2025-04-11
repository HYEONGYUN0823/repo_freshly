package com.a7a7.module.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a7a7.module.basic.BasicService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService service;
	@Autowired
	BasicService basicService;
	
	// 모바일 주문 리스트 화면 입니다.
	@RequestMapping(value ="/mob/account/orderlist")
	public String moborderlist(Model model) {
		model.addAttribute("list", service.selectOrderList());
		return "/mobile/account/orderlist";
	}
	
	// 앱 주문 리스트 화면 입니다.
	@RequestMapping(value ="/web/account/orderList")
	public String weborderlist(Model model) {
		model.addAttribute("list", service.selectOrderList());
		return "/web/account/orderList";
	}
	
	
	
	// 코드그룹 Insert 화면
	@RequestMapping(value = "/web/account/orderForm")
	public String orderForm(Model model) {
		
		model.addAttribute("accountGroup", basicService.selectAccountList());
		
		return "web/account/orderForm";
	}
	// 코드그룹 Insert
	@RequestMapping(value = "/web/account/orderInst")
	public String orderInst(OrderDto dto) {
		service.insert(dto);
		return "redirect:/web/account/orderList";
	}
		
}
