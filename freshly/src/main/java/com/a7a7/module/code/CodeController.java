package com.a7a7.module.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	// 코드 Form 화면
	@RequestMapping(value = "/web/system/codeForm")
	public String codeForm(@RequestParam("formSeq") String formSeq, Model model) {
		
		// 코드그룹 selectBox
		model.addAttribute("codeGroup", codeGroupService.selectCodeGroupList());
		
		if (formSeq.equals("0")) {	// Insert
					
		} else {	// Update
			model.addAttribute("item", service.selectOneCode(formSeq));
		}
		
		return "web/system/codeForm";
	}
	
	// 코드 Insert
	@RequestMapping(value = "/web/system/codeInst")
	public String codeInst(CodeDto dto) {
		service.insert(dto);
		return "redirect:/web/system/codeList";
	}
	
	// 코드그룹 Update
	@RequestMapping(value = "/web/system/codeUpdt")
	public String codeUpdt(CodeDto dto) {
		service.update(dto);
		return "redirect:/web/system/codeList";
	}
	
}
