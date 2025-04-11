package com.a7a7.module.basic;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BasicDao {

//	**********************************************
// 		식료품
//**********************************************
	public List<BasicDto> selectGroceryList();		//리스트
	public int GroceryInsert(BasicDto dto);						//insert
	
	
//	**********************************************
//		거래처
//**********************************************
	public List<BasicDto> selectAccountList();		//리스트
	public int AccountInsert(BasicDto dto);						//insert
	
	
//	**********************************************
//		공장
//**********************************************
	public List<BasicDto> selectFactoryList();		//리스트
	public int FactoryInsert(BasicDto dto);						//insert
	
}
