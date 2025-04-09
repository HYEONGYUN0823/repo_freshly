package com.a7a7.module.delivery;

public class DeliveryDto {

	private String seq;
	private Integer deliveryStatus;
	private String deliveryStartDateTime;
	private String deliveryEndDateTime;
	private Integer deliveryDelNy;
	private String acOrder_seq;
	
	
	
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
	
	
	
}
