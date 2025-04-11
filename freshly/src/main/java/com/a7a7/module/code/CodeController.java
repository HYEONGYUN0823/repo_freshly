package com.a7a7.module.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a7a7.module.codegroup.CodeGroupService;

@Controller
public class CodeController {
	
	@Autowired
	CodeService service;
	@Autowired
	CodeGroupService codeGroupService;
	
	// 코드 list 화면
	@RequestMapping(value = "/web/system/codeList")
	public String selectWebcodeList(Model model) {
		
		model.addAttribute("list", service.selectCodeList());
		
		return "web/system/codeList";
	}
	
	// 코드그룹 Insert 화면
	@RequestMapping(value = "/web/system/codeForm")
	public String codeForm(Model model) {
		
		model.addAttribute("codeGroup", codeGroupService.selectCodeGroupList());
		
		return "web/system/codeForm";
	}
	// 코드그룹 Insert
	@RequestMapping(value = "/web/system/codeInst")
	public String codeInst(CodeDto dto) {
		service.insert(dto);
		return "redirect:/web/system/codeList";
	}
	
}
