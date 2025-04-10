package com.a7a7.module.individualorder;

public class IndividualOrderDto {

	private String io_seq;          // 개개별 시컨스
	private Integer ioQuantity;
	private String ac_seq;
	private String acOrder_seq;
	private String gcName;
	private Integer gcPrice;
	private Integer totalPrice;  // mapper에서 값을 세팅했음.
	
	public String getIo_seq() {
		return io_seq;
	}
	public void setIo_seq(String io_seq) {
		this.io_seq = io_seq;
	}
	public Integer getIoQuantity() {
		return ioQuantity;
	}
	public void setIoQuantity(Integer ioQuantity) {
		this.ioQuantity = ioQuantity;
	}
	public String getAc_seq() {
		return ac_seq;
	}
	public void setAc_seq(String ac_seq) {
		this.ac_seq = ac_seq;
	}
	public String getAcOrder_seq() {
		return acOrder_seq;
	}
	public void setAcOrder_seq(String acOrder_seq) {
		this.acOrder_seq = acOrder_seq;
	}
	public String getGcName() {
		return gcName;
	}
	public void setGcName(String gcName) {
		this.gcName = gcName;
	}
	public Integer getGcPrice() {
		return gcPrice;
	}
	public void setGcPrice(Integer gcPrice) {
		this.gcPrice = gcPrice;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	
}
