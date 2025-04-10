package com.a7a7.module.receiving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ReceivingController {
    @Autowired
    ReceivingService service;

    // 모바일 공장 발주관리
    @RequestMapping(value ="/mob/factory/ReceivingList")
    public String mobReceivingList(Model model) {
        model.addAttribute("list", service.selectList());
        return "mobile/factory/ReceivingList";
    }

    // 웹 공장 발주관리
    @RequestMapping(value ="/web/factory/ReceivingList")
    public String webReceivingList(Model model) {
        model.addAttribute("list", service.selectList());
        return "web/factory/ReceivingList";
    }
}
