package com.a7a7.module.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.a7a7.module.basic.BasicService;
import com.a7a7.module.delivery.DeliveryDto;
import com.a7a7.module.delivery.DeliveryService;
import com.a7a7.module.member.MemberService;
import com.a7a7.module.ordering.OrderingDto;
import com.a7a7.module.ordering.OrderingService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService service;
	@Autowired
	BasicService basicService;
	@Autowired
	MemberService memberService;
	@Autowired
	DeliveryService deliveryService;
	
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
	
	// 주문 Uelete
	@RequestMapping(value = "/web/account/orderUele")
	public String orderUelete(@RequestParam("formSeq") List<String> seqList) {
		
		for(String seq : seqList) {
			service.uelete(seq);
		}
		
		return "redirect:/web/account/orderList";
	}
	
	// 배송 Insert 
	@RequestMapping(value = "/web/account/orderModalInst")
	public String orderModalInst(@RequestParam("formSeq") List<String> seqList) {
		
		DeliveryDto deliveryDto = new DeliveryDto();
		
		for(String seq : seqList) {
			
			OrderDto dto = service.selectOneOrder(seq);
			dto.setAoStatus(2);
			service.update(dto);
			
			deliveryDto.setAcOrder_seq(seq);
			deliveryService.deliveryInsert(deliveryDto);
		}
		
		return "redirect:/web/account/orderList";
	}
	
//	// 배송 Insert Ajax
//	@RequestMapping(value = "/web/account/deliveryInstProc")
//	@ResponseBody
//	public String deliveryInstProc(@RequestParam("seq") String seq) {
//		
//		DeliveryDto deliveryDto = new DeliveryDto();
//		deliveryDto.setAcOrder_seq(seq);
//		
//		OrderDto dto = service.selectOneOrder(seq);
//		dto.setAoStatus(4);
//		service.update(dto);
//		
//		deliveryService.deliveryInsert(deliveryDto);
//		
//		return "redirect:/web/account/orderList";
//	}
		
}
