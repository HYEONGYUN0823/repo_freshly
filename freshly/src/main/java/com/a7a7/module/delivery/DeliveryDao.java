package com.a7a7.module.delivery;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryDao {
	
	public List<DeliveryDto> selectDeliveryList();
	public DeliveryDto selectDeliveryView(DeliveryDto dto);
	
	public int deliveryInsert(DeliveryDto dto);
	public int deliveryUpdate(DeliveryDto dto);

}
