package com.a7a7.module.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BasicController {
	
	@Autowired
	BasicService service;
	
//	**********************************************
//		Web
//	**********************************************
	
	// ******** 식료품 관리 ********
	// 식료품 list 화면
	@RequestMapping(value = "/web/basic/groceryList")
	public String selectWebGroceryList(Model model) {
		
		model.addAttribute("list", service.selectGroceryList());
		
		return "web/basic/groceryList";
	}
	
	@RequestMapping(value = "/web/basic/groceryForm")
	public String selectWebGroceryForm(@ModelAttribute("vo") BasicVo vo, BasicDto dto,Model model) {
		//insert
		if(vo.getSeq().equals("0") || vo.getSeq().equals(" ")) {	
		}// update
		else {
			model.addAttribute("item", service.selectGroceryView(dto));
		}
		return "web/basic/groceryForm";
	}
	
	@RequestMapping(value="/web/basic/groceryInsert")
	public String groceryWebGrocertInsert(BasicDto dto) {
		service.GroceryInsert(dto);
		return "redirect:/web/basic/groceryList";
	}
	
	@RequestMapping(value="/web/basic/groceryUpdate")
	public String groceryWebGrocertUpdate(BasicDto dto) {
		service.GroceryUpdate(dto);
		return "redirect:/web/basic/groceryList";
	}
	
	
	
	
	
	
	// ******** 거래처 관리 ********
	// 거래처 list 화면
	@RequestMapping(value = "/web/basic/accountList")
	public String selectWebAccountList(Model model) {
		
		model.addAttribute("list", service.selectAccountList());
		
		return "web/basic/accountList";
	}
	
	@RequestMapping(value = "/web/basic/accountForm")
	public String selectWebAccountForm(@ModelAttribute("vo") BasicVo vo, BasicDto dto,Model model) {
		//insert
		if(vo.getSeq().equals("0") || vo.getSeq().equals(" ")) {						
		}// update
		else {
			model.addAttribute("item", service.selectAccountView(dto));
		}
		return "web/basic/accountForm";
	}
	
	
	@RequestMapping(value="/web/basic/accountInsert")
	public String groceryWebAccountInsert(BasicDto dto) {
		service.AccountInsert(dto);
		return "redirect:/web/basic/accountList";
	}
	
	@RequestMapping(value="/web/basic/accountUpdate")
	public String groceryWebAccountUpdate(BasicDto dto) {
		service.AccountUpdate(dto);
		return "redirect:/web/basic/accountList";
	}
	
	
	
	// ******** 공장 관리  ********
	// 공장 list 화면
	@RequestMapping(value = "/web/basic/factoryList")
	public String selectWebFactoryList(Model model) {
		
		model.addAttribute("list", service.selectFactoryList());
		
		return "web/basic/factoryList";
	}
	
	@RequestMapping(value = "/web/basic/factoryForm")
	public String selectWebFactoryForm(@ModelAttribute("vo") BasicVo vo, BasicDto dto,Model model) {
		//insert
		if(vo.getSeq().equals("0") || vo.getSeq().equals(" ")) {
					
		}// update
		else {
			model.addAttribute("item", service.selectFactoryView(dto));
		}
		return "web/basic/factoryForm";
	}
	
	@RequestMapping(value="/web/basic/factoryInsert")
	public String groceryWebFactoryInsert(BasicDto dto) {
		service.FactoryInsert(dto);
		return "redirect:/web/basic/factoryList";
	}
	
	@RequestMapping(value="/web/basic/factoryUpdate")
	public String groceryWebFactoryUpdate(BasicDto dto) {
		service.FactoryUpdate(dto);
		return "redirect:/web/basic/factoryList";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	**********************************************
//	Mobile
//	**********************************************
	// 식료품 관리
	// 식료품 list 화면
	@RequestMapping(value = "/mob/basic/groceryList")
	public String selectMobGroceryList(Model model) {
		
		model.addAttribute("list", service.selectGroceryList());
		
		return "mobile/basic/groceryList";
	}
	
	// 거래처 관리
	// 거래처 list 화면
	@RequestMapping(value = "/mob/basic/accountList")
	public String selectMobAccountList(Model model) {
		
		model.addAttribute("list", service.selectAccountList());
		
		return "mobile/basic/accountList";
	}
	
	// 공장 관리
	// 공장 list 화면
	@RequestMapping(value = "/mob/basic/factoryList")
	public String selectMobFactoryList(Model model) {
		
		model.addAttribute("list", service.selectFactoryList());
		
		return "mobile/basic/factoryList";
	}
	
}
