package com.a7a7.module.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AccountController {
	
	@Autowired
	AccountService service;
	
	
	//거래처 주문관리 ui
	@RequestMapping( value="mob/account/orderlist")      // mob와 account사이에 추가할 부분이 있을지 여부때문에 주석 달아놓습니다.(기존html -> dashboard -> list형태여)
	public String accountorderlist() {
		
		return "/mobile/account/orderlist";
	}
	
}
