package com.a7a7.module.order;

public class OrderDto {

	private String seq;
	private Integer acOrderStatus;
	private String acOrderDateTime;
	private Integer acOrderDelNy;
	private String account_seq;
	private Integer ioCount;
	
	
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
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
	
	
}
