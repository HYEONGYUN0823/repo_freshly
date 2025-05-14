package com.a7a7.module.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.a7a7.module.basic.BasicController;
import com.a7a7.module.basic.BasicVo;
import com.a7a7.module.order.OrderDto;
import com.a7a7.module.order.OrderService;
import com.a7a7.module.ordering.OrderingService;


@Controller
public class DeliveryController {

	@Autowired
	DeliveryService service;
	
	@Autowired
	OrderService orderservice;
	
	// 배송 List 화면
	@RequestMapping(value ="/web/delivery/deliverylist")
	public String mobdeliverylist(Model model) {
		model.addAttribute("list", service.selectDeliveryList());
		return "web/delivery/deliverylist";
	}
	
	// Insert
	@RequestMapping(value ="/web/delivery/deliveryInsert")
	public String mobdeliveryInsert(DeliveryDto dto) {
		service.deliveryInsert(dto);
		return "redirect:/web/delivery/deliverylist";
	}
	
	// Uelete
	@RequestMapping(value = "/web/delivery/deliveryUelete")
	public String deliveryUelete(@RequestParam("seq") List<Integer> seqList) {
		service.deliveryUelete(seqList);
		return "redirect:/web/delivery/deliverylist";
	}
	
	// 선택 배송 완료
	@RequestMapping(value = "/web/delivery/deliveryCompleted")
	public String deliveryCompleted(@RequestParam("seq") List<String> seqList) {
		
		DeliveryDto dto = new DeliveryDto();
		OrderDto orderDto = new OrderDto();
		
		for(String seq : seqList) {
			dto.setSeq(seq);
			dto = service.selectDeliveryView(dto);
			dto.setDeliveryStatus(2);
			service.deliveryUpdate(dto);
			
			orderDto = orderservice.selectOneOrder(dto.getAcOrder_seq());
			orderDto.setAoStatus(3);
			orderservice.update(orderDto);
		}
		return "redirect:/web/delivery/deliverylist";
	}
	
	// 전체 배송 완료
	@RequestMapping(value = "/web/delivery/allDeliveryCompleted")
	public String allDeliveryCompleted() {
		service.allDeliveryCompleted();
		orderservice.allOrderDeliveryCompleted();
		return "redirect:/web/delivery/deliverylist";
	}
	
}
