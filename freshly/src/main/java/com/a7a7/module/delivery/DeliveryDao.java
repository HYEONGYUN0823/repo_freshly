package com.a7a7.module.delivery;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryDao {
	
	public List<DeliveryDto> selectDeliveryList();
	
	public int deliveryInsert(DeliveryDto dto);

}
