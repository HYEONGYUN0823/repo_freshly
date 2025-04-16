package com.a7a7.module.ordering;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderingDao {
	
	public List<OrderingDto> selectOrderingList();
	
	public List<OrderingDto> selectReceivingList();
	
	public List<OrderingDto> selectForwardingWaitingList();
	
	public List<OrderingDto> selectDeliveryCompletedList();
	
	public OrderingDto selectOne(OrderingDto dto);
	
	public int insert(OrderingDto dto);
	
	public int update(OrderingDto dto);
	
	public int completeUpdate(String seq);
	
	public int uelete(String seq);
}
