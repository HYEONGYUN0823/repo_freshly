package com.a7a7.module.code;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao {
	
	public List<CodeDto> selectCodeList();
	public CodeDto selectOneCode(String seq);
	public int insert(CodeDto dto);
	public int update(CodeDto dto);
	public int uelete(String seq);
	
	 public List<CodeDto> selectListCachedCodeArrayList();

	public List<CodeDto> selectCategory(@Param("codeGroup_seq")String codeGroup_seq);
}
