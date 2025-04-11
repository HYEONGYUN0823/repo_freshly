package com.a7a7.module.codegroup;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {

	public List<CodeGroupDto> selectCodeGroupList();
	public int insert(CodeGroupDto dto);
	
}
