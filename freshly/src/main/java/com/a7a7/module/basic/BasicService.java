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
	//form 에서 카테고리 보여주게 하기 위한 용도
	public List<CodeDto> selectCategory(String codeGroup_seq){
		return cddao.selectCategory(codeGroup_seq);
	}
	public List<BasicDto> cdList(){
		return dao.cdList();
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
	
	public int GroceryUelete(String seq) {
		return dao.GroceryUelete(seq);
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
	public int AccountUelete(String seq) {
		return dao.AccountUelete(seq);
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
	public int FactoryUelete(String seq) {
		return dao.FactoryUelete(seq);
	}
	
	
	
	
}
