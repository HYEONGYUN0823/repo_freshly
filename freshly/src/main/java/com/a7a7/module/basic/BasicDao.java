package com.a7a7.module.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicDao {

//	**********************************************
// 		식료품
//**********************************************
	public List<BasicDto> selectGroceryList();		//리스트
	public BasicDto selectGroceryView(BasicDto dto);
	public int GroceryInsert(BasicDto dto);						//insert
	public int GroceryUpdate(BasicDto dto);
	public int GroceryUelete(@Param("seqs")List<Integer> seqs);
	
//	**********************************************
//		거래처
//**********************************************
	public List<BasicDto> selectAccountList();		//리스트
	public BasicDto selectAccountView(BasicDto dto);
	public int AccountInsert(BasicDto dto);						//insert
	public int AccountUpdate(BasicDto dto);	
	public int AccountUelete(@Param("seqs")List<Integer> seqs);
//	**********************************************
//		공장
//**********************************************
	public List<BasicDto> selectFactoryList();		//리스트
	public BasicDto selectFactoryView(BasicDto dto);
	public int FactoryInsert(BasicDto dto);						//insert
	public int FactoryUpdate(BasicDto dto);
	public int FactoryUelete(@Param("seqs")List<Integer> seqs);
}
