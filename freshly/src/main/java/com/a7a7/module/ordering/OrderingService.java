package com.a7a7.module.ordering;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderingService {
	@Autowired
	OrderingDao dao;
	
	public List<OrderingDto> selectOrderingList(){
		return dao.selectOrderingList();
	}
	
	public List<OrderingDto> selectReceivingList(){
		return dao.selectReceivingList();
	}
	
	public List<OrderingDto> selectForwardingWaitingList(){
		return dao.selectForwardingWaitingList();
	}
	
	public List<OrderingDto> selectDeliveryCompletedList(){
		return dao.selectDeliveryCompletedList();
	}
	
	public OrderingDto selectOne(OrderingDto dto) {
		return dao.selectOne(dto);
	}
	
	public int insert(OrderingDto dto) {
		return dao.insert(dto);
	}
	
	public int update(OrderingDto dto) {
		return dao.update(dto);
	}
	
	public int completeUpdate(String seq) {
		return dao.completeUpdate(seq);
	}
	
	public int uelete(String seq) {
		return dao.uelete(seq);
	}
	
}
