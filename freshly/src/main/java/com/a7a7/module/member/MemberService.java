package com.a7a7.module.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	MemberDao dao;
	
	public MemberDto loginChk(MemberDto dto) {
		return dao.loginChk(dto);
	}
	
	public int idChk(MemberDto dto) {
		return dao.idChk(dto);
	}
	
	
	// #########################   WEB 화면 ################### 
	
	public List<MemberDto> selectMemberList(){
		return dao.selectMemberList();
	}
}
