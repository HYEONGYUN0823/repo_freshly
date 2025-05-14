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
	
	public DeliveryDto selectDeliveryView(DeliveryDto dto) {
		return dao.selectDeliveryView(dto);
	}
	
	public int deliveryInsert(DeliveryDto dto) {
		return dao.deliveryInsert(dto);
	}
	

	public int deliveryUpdate(DeliveryDto dto) {
		return dao.deliveryUpdate(dto);
	}
	
	public int allDeliveryCompleted() {
		return dao.allDeliveryCompleted();
	}
	
	public int deliveryUelete(List<Integer> seqs) {
		return dao.deliveryUelete(seqs);
	}
}
