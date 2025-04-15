package com.a7a7.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a7a7.module.basic.BasicDto;
import com.a7a7.module.basic.BasicVo;
import com.a7a7.module.order.OrderService;


@Controller
public class DeliveryController {

	@Autowired
	DeliveryService service;
	
	@Autowired
	OrderService orderservice;
	
	// 앱 배달 리스트 화면 입니다.
	@RequestMapping(value ="/web/delivery/deliverylist")
	public String mobdeliverylist(Model model) {
		model.addAttribute("list", service.selectDeliveryList());
		return "web/delivery/deliverylist";
	}
	
	@RequestMapping(value ="/web/delivery/deliveryForm")
	public String mobdeliveryForm(@ModelAttribute("vo") BasicVo vo, DeliveryDto dto,Model model) {
		model.addAttribute("acOrder", orderservice.selectOrderList());
		if(vo.getSeq().equals("0") || vo.getSeq().equals(" ")) {	
		}// update
		else {
			model.addAttribute("item", service.selectDeliveryView(dto));
		}
		return "web/delivery/deliveryForm";
	}
	
	@RequestMapping(value ="/web/delivery/deliveryInsert")
	public String mobdeliveryInsert(DeliveryDto dto) {
		service.deliveryInsert(dto);
		return "redirect:/web/delivery/deliverylist";
	}
	
	@RequestMapping(value ="/web/delivery/deliveryUpdate")
	public String mobdeliveryUpdate(DeliveryDto dto) {
		service.deliveryUpdate(dto);
		return "redirect:/web/delivery/deliverylist";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 모바일 배달 리스트 화면 입니다.
	@RequestMapping(value ="/mob/account/deliveryList")
	public String webdeliverylist(Model model) {
		model.addAttribute("list", service.selectDeliveryList());
		return "mob/account/deliveryList";
	}
	
}
