package com.a7a7.module.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicService {
	
	@Autowired
	BasicDao dao;
	
	public List<BasicDto> selectGroceryList() {
		return dao.selectGroceryList();
	}
	
	public List<BasicDto> selectAccountList() {
		return dao.selectAccountList();
	}

	public List<BasicDto> selectFactoryList() {
		return dao.selectFactoryList();
	}
}
