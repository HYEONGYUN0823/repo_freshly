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
	
	@Autowired
	OrderDao orderDao;

	// 개별주문 리스트
	public List<IndividualOrderDto> selectIndividualOrderList(IndividualOrderDto dto){
		return dao.selectIndividualOrderList(dto);
	}
	
	
	// 개별주문 리스트에서 주문 보여주는 용도
	public OrderDto selectOrderView(IndividualOrderDto dto){
		return orderDao.selectOrderView(dto);
	}
}
