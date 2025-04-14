package com.a7a7.module.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicService {
	
	@Autowired
	BasicDao dao;
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
		System.out.println("##############################");
		return dao.GroceryUpdate(dto);
	}
	
//	**********************************************
//	거래처
//**********************************************
	public List<BasicDto> selectAccountList() {
		return dao.selectAccountList();
	}
	public int AccountInsert(BasicDto dto) {
		return dao.AccountInsert(dto);
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
	
	
	
	
	
}
