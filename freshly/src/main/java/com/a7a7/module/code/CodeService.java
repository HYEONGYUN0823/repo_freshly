package com.a7a7.module.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CodeService {
	
	@Autowired
	CodeDao dao;
	
	public List<CodeDto> selectCodeList() {
		return dao.selectCodeList();
	}
	
	public CodeDto selectOneCode(String seq) {
		return dao.selectOneCode(seq);
	}

	public int insert(CodeDto dto) {
		return dao.insert(dto);
	}
	
	public int update(CodeDto dto) {
		return dao.update(dto);
	}
	
	public int uelete(String seq) {
		return dao.uelete(seq);
	}
	
}
