package com.a7a7.module.receiving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a7a7.module.basic.BasicService;


@Controller
public class ReceivingController {
    @Autowired
    ReceivingService service;
	@Autowired
	BasicService basicService;

    // 모바일 공장 발주관리
    @RequestMapping(value ="/mob/factory/ReceivingList")
    public String mobReceivingList(Model model) {
        model.addAttribute("list", service.selectList());
        return "mobile/factory/ReceivingList";
    }
    
    @RequestMapping(value ="/mob/factory/receivingForm")
    public String mobReceivingForm(Model model) {
    	
    	
        return "mobile/factory/receivingForm";
    }
    
	@RequestMapping(value = "web/factory/receivingInst")
	public String receivingInst(ReceivingDto dto) {
		service.insert(dto);
		
		return "redirect:/web/factory/OrderingList";
	}

    // 웹 공장 발주관리
    @RequestMapping(value ="/web/factory/ReceivingList")
    public String webReceivingList(Model model) {
        model.addAttribute("list", service.selectList());
        return "web/factory/ReceivingList";
    }
}
