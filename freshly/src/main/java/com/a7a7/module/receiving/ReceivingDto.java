package com.a7a7.module.receiving;

public class ReceivingDto {
	
	private String seq;
	private Integer rcStatus;
	private String rcRegDateTime;
	private String rcModDateTime;
	private String rcQuantity;
	private Integer rcDelNy;
	private String factory_seq;
	private String grocery_seq;
	
//	-----
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getRcStatus() {
		return rcStatus;
	}
	public void setRcStatus(Integer rcStatus) {
		this.rcStatus = rcStatus;
	}
	public String getRcRegDateTime() {
		return rcRegDateTime;
	}
	public void setRcRegDateTime(String rcRegDateTime) {
		this.rcRegDateTime = rcRegDateTime;
	}
	public String getRcModDateTime() {
		return rcModDateTime;
	}
	public void setRcModDateTime(String rcModDateTime) {
		this.rcModDateTime = rcModDateTime;
	}
	public String getRcQuantity() {
		return rcQuantity;
	}
	public void setRcQuantity(String rcQuantity) {
		this.rcQuantity = rcQuantity;
	}
	public Integer getRcDelNy() {
		return rcDelNy;
	}
	public void setRcDelNy(Integer rcDelNy) {
		this.rcDelNy = rcDelNy;
	}
	public String getFactory_seq() {
		return factory_seq;
	}
	public void setFactory_seq(String factory_seq) {
		this.factory_seq = factory_seq;
	}
	public String getGrocery_seq() {
		return grocery_seq;
	}
	public void setGrocery_seq(String grocery_seq) {
		this.grocery_seq = grocery_seq;
	}
	
}
