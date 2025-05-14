package com.a7a7.module.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a7a7.module.basic.BasicDao;
import com.a7a7.module.basic.BasicDto;
import com.a7a7.module.delivery.DeliveryDao;
import com.a7a7.module.delivery.DeliveryDto;

@Service
public class OrderService {

	@Autowired
	OrderDao dao;
	
	@Autowired
	BasicDao basicDao;
	
	@Autowired
	DeliveryDao deliveryDao;
	
	public OrderDto selectOneOrder(String seq){
		return dao.selectOneOrder(seq);
	}
	
	public List<OrderDto> selectOrderList(){
		return dao.selectOrderList();
	}
	
	public int insert(OrderDto dto) {
		return dao.insert(dto);
	}
	
	public int update(OrderDto dto) {
		return dao.update(dto);
	}
	
	public int uelete(String seq) {
		return dao.uelete(seq);
	}
	
	// 일괄 배송처리
	public List<Map<String, Integer>> processAllOrdersToDelivery() {
		// itemList.get(0) : 배송완료 품목과 수량
		// itemList.get(1) : 발주필요 품목과 수량
		List<Map<String, Integer>> itemList = new ArrayList<>();
		itemList.add(new HashMap<String, Integer>());
		itemList.add(new HashMap<String, Integer>());
		
		BasicDto basicDto = new BasicDto();
		// 접수 상태인 주문 전체 출력
		List<OrderDto> dtoList = dao.findOrdersByAoStatus1();
		for(OrderDto dto : dtoList) {
			basicDto.setSeq(dto.getGrocery_seq());
			basicDto = basicDao.selectGroceryView(basicDto);
			
			int sub = basicDto.getGcStock() - dto.getAoQuantity();
			
			String name = basicDto.getGcName();
			// 재고가 부족하면 배송X
			if(sub < 0) {
				itemList.get(1).put(name, itemList.get(1).getOrDefault(name, 0) + dto.getAoQuantity());
				continue;
			}
			
			itemList.get(0).put(name, itemList.get(0).getOrDefault(name, 0) + dto.getAoQuantity());
			// 주문 상태 '배송중'으로 변경
			dto.setAoStatus(2);
			dao.update(dto);
			
			// 식료품 재고 Update
			basicDto.setGcStock(sub);
			basicDao.GroceryUpdate(basicDto);
			
			// 배송 Insert
			DeliveryDto deliveryDto = new DeliveryDto();
			deliveryDto.setAcOrder_seq(dto.getSeq());
			deliveryDao.deliveryInsert(deliveryDto);
			
		}
		
		
		return itemList;
	}
}
