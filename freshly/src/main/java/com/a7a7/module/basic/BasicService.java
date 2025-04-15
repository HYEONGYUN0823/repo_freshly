package com.a7a7.module.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a7a7.module.code.CodeDao;
import com.a7a7.module.code.CodeDto;

@Service
public class BasicService {
	
	@Autowired
	BasicDao dao;
	
	@Autowired
	CodeDao cddao;
	
//	**********************************************
//	공통
//**********************************************	
	public List<CodeDto> selectCategory(String codeGroup_seq){
		return cddao.selectCategory(codeGroup_seq);
	}
//	**********************************************
//		식료품
//**********************************************
	public List<BasicDto> selectGroceryList() {
		return dao.selectGroceryList();
	}
	public BasicDto selectGroceryView(BasicDto dto) {
		return dao.selectGroceryView(dto);
	}
	
	public int GroceryInsert(BasicDto dto) {
		return dao.GroceryInsert(dto);
	}
	public int GroceryUpdate(BasicDto dto) {
		return dao.GroceryUpdate(dto);
	}
	
	public int GroceryUelete(List<Integer> seqs) {
		return dao.GroceryUelete(seqs);
	}
	
	
//	**********************************************
//	거래처
//**********************************************
	public List<BasicDto> selectAccountList() {
		return dao.selectAccountList();
	}
	public BasicDto selectAccountView(BasicDto dto) {
		return dao.selectAccountView(dto);
	}
	public int AccountInsert(BasicDto dto) {
		return dao.AccountInsert(dto);
	}
	public int AccountUpdate(BasicDto dto) {
		return dao.AccountUpdate(dto);
	}
	public int AccountUelete(List<Integer> seqs) {
		return dao.AccountUelete(seqs);
	}
//	**********************************************
//	공장
//**********************************************
	public List<BasicDto> selectFactoryList() {
		return dao.selectFactoryList();
	}
	public BasicDto selectFactoryView(BasicDto dto) {
		return dao.selectFactoryView(dto);
	}
	
	public int FactoryInsert(BasicDto dto) {
		return dao.FactoryInsert(dto);
	}
	
	public int FactoryUpdate(BasicDto dto) {
		return dao.FactoryUpdate(dto);
	}
	public int FactoryUelete(List<Integer> seqs) {
		return dao.FactoryUelete(seqs);
	}
	
	
	
	
}
