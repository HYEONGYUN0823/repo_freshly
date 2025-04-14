package com.a7a7.module.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {

	public MemberDto loginChk(MemberDto dto);
	public int idChk(MemberDto dto);
	
	
	
	// #########################   WEB 화면 ################### 
	
	public List<MemberDto> selectMemberList();
	
	public MemberDto selectMemberView(MemberDto dto);
	
	public int MemberInsert(MemberDto dto);
	
	public int MemberUpdate(MemberDto dto);
}
