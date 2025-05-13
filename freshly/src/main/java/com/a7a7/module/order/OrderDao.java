package com.a7a7.module.order;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {
	
	public OrderDto selectOneOrder(String seq);
	public List<OrderDto> selectOrderList();
	public int insert(OrderDto dto);
	public int update(OrderDto dto);
	public int uelete(String seq);
	
	public List<OrderDto> findOrdersByAoStatus1();

}
