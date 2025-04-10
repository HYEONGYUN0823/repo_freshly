package com.a7a7.module.ordering;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a7a7.module.order.OrderDto;

@Service
public class OrderingService {
	@Autowired
	OrderingDao dao;
	
	public List<OrderDto> selectList(){
		return dao.selectList();
	}
	
}
