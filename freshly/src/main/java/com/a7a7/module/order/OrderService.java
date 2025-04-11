package com.a7a7.module.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderDao dao;
	
	public OrderDto selectOneOrder(String seq){
		return dao.selectOneOrder(seq);
	}
	
	public List<OrderDto> selectOrderList(){
		return dao.selectOrderList();
	}
	
	public int insert(OrderDto dto) {
		return dao.insert(dto);
	}
}
