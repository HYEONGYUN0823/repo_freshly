package com.a7a7.module.delivery;

import java.util.List;

public class DeliveryDto {

	private String seq;
	private Integer deliveryStatus;
	private String deliveryStartDateTime;
	private String deliveryEndDateTime;
	private Integer deliveryDelNy;
	private String acOrder_seq;
	private List<Integer> seqs;  // uelete 메서드를 위한 공통 seqs.
	
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(Integer deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getDeliveryStartDateTime() {
		return deliveryStartDateTime;
	}
	public void setDeliveryStartDateTime(String deliveryStartDateTime) {
		this.deliveryStartDateTime = deliveryStartDateTime;
	}
	public String getDeliveryEndDateTime() {
		return deliveryEndDateTime;
	}
	public void setDeliveryEndDateTime(String deliveryEndDateTime) {
		this.deliveryEndDateTime = deliveryEndDateTime;
	}
	public Integer getDeliveryDelNy() {
		return deliveryDelNy;
	}
	public void setDeliveryDelNy(Integer deliveryDelNy) {
		this.deliveryDelNy = deliveryDelNy;
	}
	public String getAcOrder_seq() {
		return acOrder_seq;
	}
	public void setAcOrder_seq(String acOrder_seq) {
		this.acOrder_seq = acOrder_seq;
	}
	public List<Integer> getSeqs() {
		return seqs;
	}
	public void setSeqs(List<Integer> seqs) {
		this.seqs = seqs;
	}
	
	
	
}
