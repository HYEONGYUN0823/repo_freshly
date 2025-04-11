package com.a7a7.module.individualorder;

public class IndividualOrderDto {

	// 개별 주문
	private String seq;
	private Integer ioQuantity;
	private Integer ioDelNy;
	private String grocery_seq;
	private String acOrder_seq;
	
	private Integer ioTotalPrice;
	
	// 주문
	private Integer acOrderStatus;
	private String acOrderDateTime;
	private String account_seq;
	private Integer ioCount;
	
	// 식료품		
	private String gcName;
	private Integer gcPrice;
	
//	*************************************
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getIoQuantity() {
		return ioQuantity;
	}
	public void setIoQuantity(Integer ioQuantity) {
		this.ioQuantity = ioQuantity;
	}
	public Integer getIoDelNy() {
		return ioDelNy;
	}
	public void setIoDelNy(Integer ioDelNy) {
		this.ioDelNy = ioDelNy;
	}
	public String getGrocery_seq() {
		return grocery_seq;
	}
	public void setGrocery_seq(String grocery_seq) {
		this.grocery_seq = grocery_seq;
	}
	public String getAcOrder_seq() {
		return acOrder_seq;
	}
	public void setAcOrder_seq(String acOrder_seq) {
		this.acOrder_seq = acOrder_seq;
	}
	public Integer getIoTotalPrice() {
		return ioTotalPrice;
	}
	public void setIoTotalPrice(Integer ioTotalPrice) {
		this.ioTotalPrice = ioTotalPrice;
	}
	public Integer getAcOrderStatus() {
		return acOrderStatus;
	}
	public void setAcOrderStatus(Integer acOrderStatus) {
		this.acOrderStatus = acOrderStatus;
	}
	public String getAcOrderDateTime() {
		return acOrderDateTime;
	}
	public void setAcOrderDateTime(String acOrderDateTime) {
		this.acOrderDateTime = acOrderDateTime;
	}
	public String getAccount_seq() {
		return account_seq;
	}
	public void setAccount_seq(String account_seq) {
		this.account_seq = account_seq;
	}
	public Integer getIoCount() {
		return ioCount;
	}
	public void setIoCount(Integer ioCount) {
		this.ioCount = ioCount;
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
	
}
