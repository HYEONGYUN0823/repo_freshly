package com.a7a7.module.ordering;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.a7a7.module.order.OrderDto;

@Repository
public interface OrderingDao {
	
	public List<OrderDto> selectOrderingList();
	
	public List<OrderDto> selectReceivingList();
	
	public OrderingDto selectOne(OrderingDto dto);
	
	public int insert(OrderingDto dto);
	
	public int update(OrderingDto dto);
	
	public int uelete(@Param("seqs")List<Integer> seqs);
}
