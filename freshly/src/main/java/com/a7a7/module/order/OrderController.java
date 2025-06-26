package com.a7a7.module.order;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.a7a7.module.basic.BasicDto;
import com.a7a7.module.basic.BasicService;
import com.a7a7.module.delivery.DeliveryDto;
import com.a7a7.module.delivery.DeliveryService;
import com.a7a7.module.member.MemberService;

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
	@RequestMapping("/web/account/orderList")
	public String weborderlist(Model model) {
		model.addAttribute("list", service.selectOrderList());
		return "web/account/orderList";
	}
	
	// 주문 Form 화면
	@RequestMapping("/web/account/orderForm")
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
	@RequestMapping("/web/account/orderUpdt")
	public String orderUpdt(OrderDto dto) {
		service.update(dto);
		return "redirect:/web/account/orderList";
	}
	
	// 주문 Uelete
	@RequestMapping("/web/account/orderUele")
	public String orderUelete(@RequestParam("formSeq") List<String> seqList) {
		
		for(String seq : seqList) {
			service.uelete(seq);
		}
		
		return "redirect:/web/account/orderList";
	}
	
	// 배송 Insert 
	@RequestMapping("/web/account/orderModalInst")
	public String orderModalInst(@RequestParam("formSeq") List<String> seqList) {
		
		DeliveryDto deliveryDto = new DeliveryDto();
		BasicDto basicDto = new BasicDto();
		
		for(String seq : seqList) {
			
			// 주문 상태 '배송중'으로 변경
			OrderDto dto = service.selectOneOrder(seq);
			dto.setAoStatus(2);
			service.update(dto);
			
			// 식료품 재고 Update
			basicDto.setSeq(dto.getGrocery_seq());
			basicDto = basicService.selectGroceryView(basicDto);
			basicDto.setGcStock(basicDto.getGcStock() - dto.getAoQuantity());
			basicService.GroceryUpdate(basicDto);
			
			// 배송 Insert
			deliveryDto.setAcOrder_seq(seq);
			deliveryService.deliveryInsert(deliveryDto);
		}
		
		return "redirect:/web/account/orderList";
	}
	
	@RequestMapping("/web/account/processAllOrdersToDelivery")
	@ResponseBody
	public List<Map<String, Integer>> processAllOrdersToDelivery() {
		return service.processAllOrdersToDelivery();
	}
		
}
