package com.a7a7.module.ordering;

import java.util.List;

public class OrderingDto {
	
	private String seq;
	private Integer odStatus;
	private String odStartDateTime;
	private String odEndDateTime;
	private String odQuantity;	
	private Integer odDelNy;
	private String factory_seq;
	private String member_seq;
	private String grocery_seq;
	
	private String fcName;
	private String mbName;
	private String gcName;
	
	private List<Integer> seqs;
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
	public String getOdStartDateTime() {
		return odStartDateTime;
	}
	public void setOdStartDateTime(String odStartDateTime) {
		this.odStartDateTime = odStartDateTime;
	}
	public String getOdEndDateTime() {
		return odEndDateTime;
	}
	public void setOdEndDateTime(String odEndDateTime) {
		this.odEndDateTime = odEndDateTime;
	}
	public String getOdQuantity() {
		return odQuantity;
	}
	public void setOdQuantity(String odQuantity) {
		this.odQuantity = odQuantity;
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
	public String getMember_seq() {
		return member_seq;
	}
	public void setMember_seq(String member_seq) {
		this.member_seq = member_seq;
	}
	public String getGrocery_seq() {
		return grocery_seq;
	}
	public void setGrocery_seq(String grocery_seq) {
		this.grocery_seq = grocery_seq;
	}
	public String getFcName() {
		return fcName;
	}
	public void setFcName(String fcName) {
		this.fcName = fcName;
	}
	public String getMbName() {
		return mbName;
	}
	public void setMbName(String mbName) {
		this.mbName = mbName;
	}
	public String getGcName() {
		return gcName;
	}
	public void setGcName(String gcName) {
		this.gcName = gcName;
	}
	public List<Integer> getSeqs() {
		return seqs;
	}
	public void setSeqs(List<Integer> seqs) {
		this.seqs = seqs;
	}
	
	
	
}
