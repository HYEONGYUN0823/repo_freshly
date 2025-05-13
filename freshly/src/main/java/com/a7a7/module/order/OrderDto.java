package com.a7a7.module.order;

public class OrderDto {
//
	// acOrder 
	private String seq;
	private Integer aoStatus;
	private Integer aoQuantity;
	private String aoDateTime;
	private Integer aoDelNy;
	private String account_seq;
	private String grocery_seq;
	private String member_seq;
	
	// temp
	private Long aoTotal;
	
	// account
	private String acName;
	
	// grocery
	private String gcName;
	private Integer gcPrice;
	private Integer gcStock;
	
	// member
	private String mbName;
	
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getAoStatus() {
		return aoStatus;
	}
	public void setAoStatus(Integer aoStatus) {
		this.aoStatus = aoStatus;
	}
	public String getAoDateTime() {
		return aoDateTime;
	}
	public void setAoDateTime(String aoDateTime) {
		this.aoDateTime = aoDateTime;
	}
	public Integer getAoDelNy() {
		return aoDelNy;
	}
	public void setAoDelNy(Integer aoDelNy) {
		this.aoDelNy = aoDelNy;
	}
	public String getAccount_seq() {
		return account_seq;
	}
	public void setAccount_seq(String account_seq) {
		this.account_seq = account_seq;
	}
	public String getGrocery_seq() {
		return grocery_seq;
	}
	public void setGrocery_seq(String grocery_seq) {
		this.grocery_seq = grocery_seq;
	}
	public Long getAoTotal() {
		return aoTotal;
	}
	public void setAoTotal(Long aoTotal) {
		this.aoTotal = aoTotal;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
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
	public Integer getAoQuantity() {
		return aoQuantity;
	}
	public void setAoQuantity(Integer aoQuantity) {
		this.aoQuantity = aoQuantity;
	}
	public String getMember_seq() {
		return member_seq;
	}
	public void setMember_seq(String member_seq) {
		this.member_seq = member_seq;
	}
	public String getMbName() {
		return mbName;
	}
	public void setMbName(String mbName) {
		this.mbName = mbName;
	}
	public Integer getGcStock() {
		return gcStock;
	}
	public void setGcStock(Integer gcStock) {
		this.gcStock = gcStock;
	}
	
	
}
