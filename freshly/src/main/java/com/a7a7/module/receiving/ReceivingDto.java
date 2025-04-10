package com.a7a7.module.receiving;

public class ReceivingDto {
	
	private String seq;
	private int rcStatus;
	private String rcRegDateTime;
	private String rcModDateTime;
	private int rcDelNy;
	private String factory_seq;
	private String individualOrder_seq;
	
//	-----
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getRcStatus() {
		return rcStatus;
	}
	public void setRcStatus(int rcStatus) {
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
	public int getRcDelNy() {
		return rcDelNy;
	}
	public void setRcDelNy(int rcDelNy) {
		this.rcDelNy = rcDelNy;
	}
	public String getFactory_seq() {
		return factory_seq;
	}
	public void setFactory_seq(String factory_seq) {
		this.factory_seq = factory_seq;
	}
	public String getIndividualOrder_seq() {
		return individualOrder_seq;
	}
	public void setIndividualOrder_seq(String individualOrder_seq) {
		this.individualOrder_seq = individualOrder_seq;
	}
	
}
