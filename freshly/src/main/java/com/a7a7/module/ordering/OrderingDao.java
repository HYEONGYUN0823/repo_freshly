package com.a7a7.module.ordering;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a7a7.module.order.OrderDto;

@Repository
public interface OrderingDao {
	
	public List<OrderDto> selectList();
	
	public int insert(OrderingDto dto);
	
}
