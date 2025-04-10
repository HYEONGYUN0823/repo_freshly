package com.a7a7.module.ordering;

public class OrderingDto {
	
	private String seq;
	private int odStatus;
	private String odRegDateTime;
	private String odModDateTime;
	private int odDelNy;
	private String factory_seq;
	private String individualOrder_seq;
	
//	-----
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getOdStatus() {
		return odStatus;
	}
	public void setOdStatus(int odStatus) {
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
	public int getOdDelNy() {
		return odDelNy;
	}
	public void setOdDelNy(int odDelNy) {
		this.odDelNy = odDelNy;
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
