package com.a7a7.module.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

	@Autowired
	DeliveryDao dao;
	
	public List<DeliveryDto> selectDeliveryList(){
		return dao.selectDeliveryList();
	}
}
