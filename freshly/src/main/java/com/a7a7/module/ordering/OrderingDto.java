package com.a7a7.module.ordering;

public class OrderingDto {
	
	private String seq;
	private Integer odStatus;
	private String odRegDateTime;
	private String odModDateTime;
	private Integer odDelNy;
	private String factory_seq;
	private String acOrder_seq;
	
//	-----
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getOdStatus() {
		return odStatus;
	}
	public void setOdStatus(Integer odStatus) {
		this.odStatus = odStatus;
	}
	public String getOdRegDateTime() {
		return odRegDateTime;
	}
	public void setOdRegDateTime(String odRegDateTime) {
		this.odRegDateTime = odRegDateTime;
	}
	public String getOdModDateTime() {
		return odModDateTime;
	}
	public void setOdModDateTime(String odModDateTime) {
		this.odModDateTime = odModDateTime;
	}
	public Integer getOdDelNy() {
		return odDelNy;
	}
	public void setOdDelNy(Integer odDelNy) {
		this.odDelNy = odDelNy;
	}
	public String getFactory_seq() {
		return factory_seq;
	}
	public void setFactory_seq(String factory_seq) {
		this.factory_seq = factory_seq;
	}
	public String getAcOrder_seq() {
		return acOrder_seq;
	}
	public void setAcOrder_seq(String acOrder_seq) {
		this.acOrder_seq = acOrder_seq;
	}
	
	
}
