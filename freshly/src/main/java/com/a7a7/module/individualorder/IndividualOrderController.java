package com.a7a7.module.individualorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.a7a7.module.basic.BasicService;
import com.a7a7.module.order.OrderService;

@Controller
public class IndividualOrderController {


	@Autowired
	IndividualOrderService service;
	@Autowired
	OrderService orderService;
	@Autowired
	BasicService basicService;
	
	// 개별주문 List 화면
	@RequestMapping(value="/web/account/individualOrderList")
	public String webindividualOrderList(@RequestParam("acOrder_seq") String acOrder_seq, Model model) {
		
		model.addAttribute("order", orderService.selectOneOrder(acOrder_seq));
		model.addAttribute("list", service.selectIndividualOrderList(acOrder_seq));
		
		return "/web/account/individualOrderList";
	}
	
	// 개별주문 Insert 화면
	@RequestMapping(value = "/web/account/individualOrderForm")
	public String individualOrderForm(IndividualOrderDto dto, Model model) {
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(dto.getAcOrder_seq());
		System.out.println(dto.getGrocery_seq());
		model.addAttribute("hidden", dto);
		model.addAttribute("groceryGroup", basicService.selectGroceryList());
		
		return "web/account/individualOrderForm";
	}
	// 개별주문 Insert
	@RequestMapping(value = "/web/account/individualOrderInst")
	public String individualOrderInst(IndividualOrderDto dto, RedirectAttributes redirectAttributes) {
		System.out.println("-----------------------------------------");
		System.out.println(dto.getAcOrder_seq());
		System.out.println(dto.getGrocery_seq());
		service.insert(dto);
		redirectAttributes.addAttribute("acOrder_seq", dto.getAcOrder_seq());
		return "redirect:/web/account/individualOrderList";
	}
	
}
