package com.a7a7.module.member;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {

	public MemberDto loginChk(MemberDto dto);
	public int idChk(MemberDto dto);
}
