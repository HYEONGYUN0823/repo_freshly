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
	
	public MemberDto selectMemberView(MemberDto dto) {
		return dao.selectMemberView(dto);
	}
	
	public int MemberInsert(MemberDto dto) {
		return dao.MemberInsert(dto);
	}
	
	public int MemberUpdate(MemberDto dto) {
		return dao.MemberUpdate(dto);
	}
	public int MemberUelete(List<Integer> seqs) {
		return dao.MemberUelete(seqs);
	}
}
