package com.a7a7.module.receiving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a7a7.module.basic.BasicService;
import com.a7a7.module.order.OrderService;


@Controller
public class ReceivingController {
    @Autowired
    ReceivingService service;
	@Autowired
	BasicService basicService;
	@Autowired
	OrderService orderService;

    // 모바일 공장 발주관리
    @RequestMapping(value ="/mob/factory/ReceivingList")
    public String mobReceivingList(Model model) {
        model.addAttribute("list", service.selectList());
        return "mobile/factory/ReceivingList";
    }
    
    @RequestMapping(value ="/mob/factory/receivingForm")
    public String mobReceivingForm(Model model) {
    	model.addAttribute("listFactory", basicService.selectFactoryList());
    	model.addAttribute("listOrder", orderService.selectOrderList());
    	
        return "mobile/factory/receivingForm";
    }
    
	@RequestMapping(value = "/mob/factory/receivingInst")
	public String receivingInst(ReceivingDto dto) {
		service.insert(dto);
		
		return "redirect:/mob/factory/ReceivingList";
	}

    // 웹 공장 발주관리
    @RequestMapping(value ="/web/factory/ReceivingList")
    public String webReceivingList(Model model) {
        model.addAttribute("list", service.selectList());
        return "web/factory/ReceivingList";
    }
}
