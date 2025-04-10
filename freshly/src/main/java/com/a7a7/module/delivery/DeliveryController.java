package com.a7a7.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a7a7.module.order.OrderService;


@Controller
public class DeliveryController {

	@Autowired
	DeliveryService service;
	
	@Autowired
	OrderService orderservice;
	
	// 모바일 배달 리스트 화면 입니다.
	@RequestMapping(value ="/mob/account/deliverylist")
	public String mobdeliverylist(Model model) {
		model.addAttribute("list", service.selectDeliveryList());
		return "mobile/account/deliverylist";
	}
	
	@RequestMapping(value ="/mob/account/deliveryForm")
	public String mobdeliveryForm(Model model) {
		model.addAttribute("acOrder", orderservice.selectOrderList());
		return "mobile/account/deliveryForm";
	}
	
	@RequestMapping(value ="/mob/account/deliveryInsert")
	public String mobdeliveryInsert(DeliveryDto dto) {
		service.deliveryInsert(dto);
		return "redirect:/mob/account/deliverylist";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 앱 배달 리스트 화면 입니다.
	@RequestMapping(value ="/web/account/deliveryList")
	public String webdeliverylist(Model model) {
		model.addAttribute("list", service.selectDeliveryList());
		return "web/account/deliveryList";
	}
	
}
