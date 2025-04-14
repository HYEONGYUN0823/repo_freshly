package com.a7a7.module.receiving;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a7a7.module.order.OrderDto;

@Service
public class ReceivingService {
	@Autowired
	ReceivingDao dao;
	
	public List<OrderDto> selectList(){
		return dao.selectList();
	}
	
	public ReceivingDto selectOne(ReceivingDto dto) {
		return dao.selectOne(dto);
	}
	
	public int insert(ReceivingDto dto) {
		return dao.insert(dto);
	}
	
	public int update(ReceivingDto dto) {
		return dao.update(dto);
	}
	
	public int uelete(ReceivingDto dto) {
		return dao.uelete(dto);
	}
	
}
