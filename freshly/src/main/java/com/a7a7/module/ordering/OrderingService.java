package com.a7a7.module.ordering;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a7a7.module.order.OrderDto;

@Service
public class OrderingService {
	@Autowired
	OrderingDao dao;
	
	public List<OrderDto> selectOrderingList(){
		return dao.selectOrderingList();
	}
	
	public List<OrderDto> selectReceivingList(){
		return dao.selectReceivingList();
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
	
	public int uelete(List<Integer> seqs) {
		return dao.uelete(seqs);
	}
	
}
