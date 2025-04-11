package com.a7a7.module.receiving;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a7a7.module.order.OrderDto;

@Repository
public interface ReceivingDao {
	
	public List<OrderDto> selectList();
	
	public int insert(ReceivingDto dto);
	
}
