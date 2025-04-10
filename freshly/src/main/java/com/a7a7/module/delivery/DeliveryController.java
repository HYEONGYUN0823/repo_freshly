package com.a7a7.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DeliveryController {

	@Autowired
	DeliveryService service;
	
	// 모바일 배달 리스트 화면 입니다.
	@RequestMapping(value ="/mob/account/deliverylist")
	public String mobdeliverylist(Model model) {
		model.addAttribute("list", service.selectDeliveryList());
		return "mobile/account/deliverylist";
	}
	
	// 앱 배달 리스트 화면 입니다.
	@RequestMapping(value ="/web/account/deliveryList")
	public String webdeliverylist(Model model) {
		model.addAttribute("list", service.selectDeliveryList());
		return "web/account/deliveryList";
	}
	
}
