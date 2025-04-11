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
	
	// 코드그룹 Insert 화면
	@RequestMapping(value = "/web/system/codeGroupForm")
	public String codeGroupForm() {
		
		return "web/system/codeGroupForm";
	}
	// 코드그룹 Insert
	@RequestMapping(value = "/web/system/codeGroupInst")
	public String codeGroupInst(CodeGroupDto dto) {
		service.insert(dto);
		return "redirect:/web/system/codeGroupList";
	}
	
}
