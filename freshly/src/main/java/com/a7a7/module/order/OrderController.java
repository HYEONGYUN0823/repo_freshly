package com.a7a7.module.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

	@Autowired
	OrderService service;
	
	@RequestMapping(value ="/mob/account/orderlist")
	public String accountorderlist(Model model) {
		model.addAttribute("lists",service.selectOrderList());
		return "/mobile/account/orderlist";
	}
	
}
