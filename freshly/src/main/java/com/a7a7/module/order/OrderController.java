package com.a7a7.module.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.a7a7.module.basic.BasicService;
import com.a7a7.module.member.MemberService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService service;
	@Autowired
	BasicService basicService;
	@Autowired
	MemberService memberService;
	
	// 주문 List 화면
	@RequestMapping(value ="/web/account/orderList")
	public String weborderlist(Model model) {
		model.addAttribute("list", service.selectOrderList());
		return "/web/account/orderList";
	}
	
	// 주문 Form 화면
	@RequestMapping(value = "/web/account/orderForm")
	public String orderForm(@RequestParam("formSeq") String formSeq, Model model) {
		
		// SelectBox
		model.addAttribute("accountGroup", basicService.selectAccountList());
		model.addAttribute("groceryGroup", basicService.selectGroceryList());
		model.addAttribute("memberGroup", memberService.selectMemberList());
		
		if (formSeq.equals("0")) {	// Insert
			
		} else {	// Update
			model.addAttribute("item", service.selectOneOrder(formSeq));
		}
		
		return "web/account/orderForm";
	}
	
	// 주문 Insert
	@RequestMapping(value = "/web/account/orderInst")
	public String orderInst(OrderDto dto) {
		service.insert(dto);
		return "redirect:/web/account/orderList";
	}
	
	// 주문 Update
	@RequestMapping(value = "/web/account/orderUpdt")
	public String orderUpdt(OrderDto dto) {
		service.update(dto);
		return "redirect:/web/account/orderList";
	}
		
}
