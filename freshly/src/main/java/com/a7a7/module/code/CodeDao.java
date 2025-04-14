package com.a7a7.module.code;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao {
	
	public List<CodeDto> selectCodeList();
	public CodeDto selectOneCode(String seq);
	public int insert(CodeDto dto);
	public int update(CodeDto dto);

}
