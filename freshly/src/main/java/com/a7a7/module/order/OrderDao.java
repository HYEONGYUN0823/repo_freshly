package com.a7a7.module.order;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {
	
	public OrderDto selectOneOrder(String seq);
	public List<OrderDto> selectOrderList();
	public int insert(OrderDto dto);

}
