package com.a7a7.module.individualorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a7a7.module.order.OrderDao;
import com.a7a7.module.order.OrderDto;

@Service
public class IndividualOrderService {
	
	@Autowired
	IndividualOrderDao dao;

	// 개별주문 리스트
	public List<IndividualOrderDto> selectIndividualOrderList(String seq){
		return dao.selectIndividualOrderList(seq);
	}
	
}
