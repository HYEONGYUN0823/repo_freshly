package com.a7a7.module.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	// 코드그룹 Form 화면
	@RequestMapping(value = "/web/system/codeGroupForm")
	public String codeGroupForm(@RequestParam("formSeq") String formSeq, Model model) {
		
		if (formSeq.equals("0")) {	// Insert
			
		} else {	// Update
			model.addAttribute("item", service.selectOneCodeGroup(formSeq));
		}
		
		return "web/system/codeGroupForm";
	}
	
	// 코드그룹 Insert
	@RequestMapping(value = "/web/system/codeGroupInst")
	public String codeGroupInst(CodeGroupDto dto) {
		service.insert(dto);
		return "redirect:/web/system/codeGroupList";
	}
	
	// 코드그룹 Update
	@RequestMapping(value = "/web/system/codeGroupUpdt")
	public String codeGroupUpdt(CodeGroupDto dto) {
		service.update(dto);
		return "redirect:/web/system/codeGroupList";
	}
	
	// 코드그룹 Uelete
	@RequestMapping(value = "/web/system/codeGroupUele")
	public String codeGroupUele(@RequestParam("formSeq") List<String> seqList) {

		for(String seq : seqList) {
			service.uelete(seq);
		}
		
		return "redirect:/web/system/codeGroupList";
	}
	
}
