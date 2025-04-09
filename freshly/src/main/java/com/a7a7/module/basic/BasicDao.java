package com.a7a7.module.basic;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BasicDao {

	public List<BasicDto> selectGroceryList();
	public List<BasicDto> selectAccountList();
	public List<BasicDto> selectFactoryList();
}
