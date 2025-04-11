package com.a7a7.module.individualorder;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IndividualOrderDao {

	public List<IndividualOrderDto> selectIndividualOrderList(String seq);
	public int insert(IndividualOrderDto dto);
}
