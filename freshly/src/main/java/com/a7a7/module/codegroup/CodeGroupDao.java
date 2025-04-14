package com.a7a7.module.codegroup;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {

	public List<CodeGroupDto> selectCodeGroupList();
	public CodeGroupDto selectOneCodeGroup(String seq);
	public int insert(CodeGroupDto dto);
	public int update(CodeGroupDto dto);
	
}
