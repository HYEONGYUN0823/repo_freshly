package com.a7a7.module.individualorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndividualOrderController {

	@Autowired
	IndividualOrderService service;
	
	//전체 주문에서 ac_seq값을 받고 그에 따른 상세 정보를 받는 컨트롤러
	@RequestMapping(value="/web/account/individualOrderList")
	public String webindividualOrderList(IndividualOrderDto dto,Model model) {
		model.addAttribute("view", service.selectOrderView(dto));
		model.addAttribute("list", service.selectIndividualOrderList(dto));
		
		return "/web/account/individualOrderList";
	}
	
}
