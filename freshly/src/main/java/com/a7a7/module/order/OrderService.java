package com.a7a7.module.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderDao dao;
	
	public List<OrderDto> selectOrderList(){
		return dao.selectOrderList();
	}
}
