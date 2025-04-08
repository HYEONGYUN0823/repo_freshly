package com.a7a7.modeule.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
	@Autowired
	MemberService signService;
}
