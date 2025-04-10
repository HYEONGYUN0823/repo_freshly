package com.a7a7.module.individualorder;

public class IndividualOrderDto {

	// 개별 주문
	
	private String io_seq;          // 개개별 시컨스
	private Integer ioQuantity;
	private String acOrder_seq;
	private Integer totalPrice;  // IndividialOrderMapper-> selectIndividualOrderList에서 값을 세팅했음.
	
	
	// 주문
	private String ac_seq;               // IndividialOrderMapper-> selectIndividualOrderList 에서 as 로 정의함.
	private Integer acOrderStatus;
	private String acOrderDateTime;
	private Integer acOrderDelNy;
	private String account_seq;
	private Integer ioCount;
	
	// 식료품
	private String gc_seq;    			 // IndividialOrderMapper-> selectIndividualOrderList에서 as 로 정의함.
	private String gcName;
	private Integer gcCategory;
	private Integer gcPrice;
	private Integer gcDelNy;
	private Integer gcUseNy;
	private String gcRegDateTime;
	private String gcModDateTime;
	
	
	
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
	public Integer getAcOrderDelNy() {
		return acOrderDelNy;
	}
	public void setAcOrderDelNy(Integer acOrderDelNy) {
		this.acOrderDelNy = acOrderDelNy;
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
	public String getGc_seq() {
		return gc_seq;
	}
	public void setGc_seq(String gc_seq) {
		this.gc_seq = gc_seq;
	}
	public Integer getGcCategory() {
		return gcCategory;
	}
	public void setGcCategory(Integer gcCategory) {
		this.gcCategory = gcCategory;
	}
	public Integer getGcDelNy() {
		return gcDelNy;
	}
	public void setGcDelNy(Integer gcDelNy) {
		this.gcDelNy = gcDelNy;
	}
	public Integer getGcUseNy() {
		return gcUseNy;
	}
	public void setGcUseNy(Integer gcUseNy) {
		this.gcUseNy = gcUseNy;
	}
	public String getGcRegDateTime() {
		return gcRegDateTime;
	}
	public void setGcRegDateTime(String gcRegDateTime) {
		this.gcRegDateTime = gcRegDateTime;
	}
	public String getGcModDateTime() {
		return gcModDateTime;
	}
	public void setGcModDateTime(String gcModDateTime) {
		this.gcModDateTime = gcModDateTime;
	}
	
	
	
	
}
