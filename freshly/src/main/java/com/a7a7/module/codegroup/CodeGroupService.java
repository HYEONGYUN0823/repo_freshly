package com.a7a7.module.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {

	@Autowired
	CodeGroupDao dao;
	
	public List<CodeGroupDto> selectCodeGroupList() {
		return dao.selectCodeGroupList();
	}
	
	public int insert(CodeGroupDto dto) {
		return dao.insert(dto);
	}
	
}
