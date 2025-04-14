package com.a7a7.module.receiving;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.a7a7.module.order.OrderDto;

@Repository
public interface ReceivingDao {
	
	public List<OrderDto> selectList();
	
	public ReceivingDto selectOne(ReceivingDto dto);
	
	public int insert(ReceivingDto dto);
	
	public int update(ReceivingDto dto);
	
	public int uelete(ReceivingDto dto);
}
