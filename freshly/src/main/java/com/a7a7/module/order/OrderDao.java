package com.a7a7.module.order;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a7a7.module.individualorder.IndividualOrderDto;

@Repository
public interface OrderDao {
	
	public OrderDto selectOneOrder(String seq);
	public List<OrderDto> selectOrderList();

}
