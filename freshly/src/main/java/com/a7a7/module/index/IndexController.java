package com.a7a7.module.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/web/")
	public String indexWeb() {
		return "web/index/index";
	}
	
	@RequestMapping(value = "/mob/")
	public String indexMob() {
		return "mobile/index/index";
	}
}
