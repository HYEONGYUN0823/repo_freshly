package com.a7a7.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DeliveryController {

	@Autowired
	DeliveryService service;
	
	@RequestMapping(value ="/mob/account/deliverylist")
	public String accountdeliverylist(Model model) {
		model.addAttribute("lists", service.selectDeliveryList());
		return "mobile/account/deliverylist";
	}
	
}
