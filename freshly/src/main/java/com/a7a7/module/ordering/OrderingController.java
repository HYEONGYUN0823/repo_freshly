package com.a7a7.module.ordering;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.a7a7.module.basic.BasicDto;
import com.a7a7.module.basic.BasicService;
import com.a7a7.module.member.MemberService;

@Controller
public class OrderingController {
	@Autowired
	OrderingService service;
	@Autowired
	BasicService basicService;
	@Autowired
	MemberService memberService;
	
    // 출고대기 목록
    @RequestMapping(value ="/mob/factory/forwardingWaitingList")
    public String mobReceivingList(Model model) {
        model.addAttribute("list", service.selectForwardingWaitingList());
        
        return "mobile/factory/forwardingWaitingList";
    }

    @RequestMapping(value = "/mob/factory/forwardingWaitingUpdt")
    public String forwardingWaitingUpdt(@RequestParam("seq") List<String> seqList) {
    	
    	for(String seq : seqList) {
    		
    		service.completeUpdate(seq);
    		
    		OrderingDto dto = new OrderingDto();
    		dto.setSeq(seq);
    		dto = service.selectOne(dto);
    		
    		System.out.println("#############");
    		System.out.println(dto.getGrocery_seq());
    		
    		BasicDto basicDto = new BasicDto();
    		basicDto.setSeq(dto.getGrocery_seq());
    		
    		basicDto = basicService.selectGroceryView(basicDto);
    		basicDto.setGcStock(basicDto.getGcStock() + dto.getOdQuantity());
    		
    		basicService.GroceryUpdate(basicDto);
    		
    	}
    	
    	return "redirect:/mob/factory/forwardingWaitingList";
    }

    @RequestMapping(value = "/mob/factory/forwardingWaitingUele")
    public String forwardingWaitingUele(@RequestParam("seq") List<String> seqList) {
    	
    	for(String seq : seqList) {
    		service.uelete(seq);
    	}
    	
        return "redirect:/mob/factory/forwardingWaitingList";
    }
    
    // 출고완료 목록
    @RequestMapping(value ="/mob/factory/deliveryCompletedList")
    public String deliveryCompletedList(Model model) {
    	model.addAttribute("list", service.selectDeliveryCompletedList());
    	
    	return "mobile/factory/deliveryCompletedList";
    }
    
	@RequestMapping(value = "/mob/factory/deliveryCompletedUele")
	public String deliveryCompletedUele(@RequestParam("seq") List<String> seqList) {

    	for(String seq : seqList) {
    		service.uelete(seq);
    	}
		
		return "redirect:/mob/factory/deliveryCompletedList";
	}
	
	// 모바일 공장 발주관리
	@RequestMapping(value ="/mob/factory/OrderingList")
	public String mobOrderingList(Model model) {
		model.addAttribute("list", service.selectOrderingList());
		
		return "mobile/factory/OrderingList";
	}
	
	// 웹 공장 발주관리
	@RequestMapping(value ="/web/factory/OrderingList")
	public String webOrderingList(Model model) {
		model.addAttribute("list", service.selectOrderingList());
		
		return "web/factory/OrderingList";
	}
	
	@RequestMapping(value = "/web/factory/OrderingForm")
	public String webOrderingForm(@ModelAttribute("vo") OrderingVo vo, OrderingDto dto, Model model) {
		model.addAttribute("listFactory", basicService.selectFactoryList());
		model.addAttribute("listGrocery", basicService.selectGroceryList());
		model.addAttribute("listMember", memberService.selectMemberList());
		
		if (vo.getSeq().equals("0") || vo.getSeq().equals("")) {
//			insert mode
		} else {
//			update mode
			model.addAttribute("item", service.selectOne(dto));
		}
		
		return "web/factory/OrderingForm";
	}
//	model.addAttribute("factoryList", factoryService.selectFactoryList());
	
	@RequestMapping(value = "/web/factory/OrderingInst")
	public String orderingInst(OrderingDto dto) {
		service.insert(dto);
		
		return "redirect:/web/factory/OrderingList";
	}
	
	@RequestMapping(value = "/web/factory/OrderingUpdt")
	public String orderingUpdt(OrderingDto dto) {
		service.update(dto);
		
		return "redirect:/web/factory/OrderingList";
	}
	
	@RequestMapping(value = "/web/factory/OrderingUele")
	public String orderingUele(@RequestParam("seq") List<String> seqList) {

    	for(String seq : seqList) {
    		service.uelete(seq);
    	}
		
		return "redirect:/web/factory/OrderingList";
	}

	
//	 ----입고관리----
	@RequestMapping(value ="/web/factory/ReceivingList")
	public String webReceivingList(Model model) {
		model.addAttribute("list", service.selectReceivingList());
		return "web/factory/receivingList";
	}
	
	@RequestMapping(value = "/web/factory/ReceivingUele")
	public String webReceivingUele(@RequestParam("seq") List<String> seqList) {

    	for(String seq : seqList) {
    		service.uelete(seq);
    	}
		
		return "redirect:/web/factory/ReceivingList";
	}
	
}
