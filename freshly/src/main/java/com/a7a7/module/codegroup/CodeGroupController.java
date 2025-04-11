package com.a7a7.module.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService service;

	// 코드그룹 list 화면
	@RequestMapping(value = "/web/system/codeGroupList")
	public String selectWebcodeGroupList(Model model) {
		
		model.addAttribute("list", service.selectCodeGroupList());
		
		return "web/system/codeGroupList";
	}
	
}
