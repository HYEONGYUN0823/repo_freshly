package com.a7a7.module.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired
	CodeService service;
	
	// 코드 list 화면
	@RequestMapping(value = "/web/system/codeList")
	public String selectWebcodeList(Model model) {
		
		model.addAttribute("list", service.selectCodeList());
		
		return "web/system/codeList";
	}
	
}
