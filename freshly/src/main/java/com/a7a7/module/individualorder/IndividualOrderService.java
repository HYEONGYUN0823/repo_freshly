package com.a7a7.module.individualorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndividualOrderService {
	
	@Autowired
	IndividualOrderDao dao;

	public List<IndividualOrderDto> selectIndividualOrderList(IndividualOrderDto dto){
		return dao.selectIndividualOrderList(dto);
	}
}
