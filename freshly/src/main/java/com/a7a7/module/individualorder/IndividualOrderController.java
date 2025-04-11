package com.a7a7.module.individualorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.a7a7.module.order.OrderService;

@Controller
public class IndividualOrderController {

	@Autowired
	IndividualOrderService service;
	@Autowired
	OrderService orderService;
	
	// 개별주문 List 화면
	@RequestMapping(value="/web/account/individualOrderList")
	public String webindividualOrderList(@RequestParam(value = "seq") String seq, Model model) {
		model.addAttribute("order", orderService.selectOneOrder(seq));
		model.addAttribute("list", service.selectIndividualOrderList(seq));
		
		return "/web/account/individualOrderList";
	}
	
}
