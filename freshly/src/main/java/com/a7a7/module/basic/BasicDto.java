package com.a7a7.module.basic;

import java.util.List;

public class BasicDto {
	
	// 공통
	private String seq;
	
	
	// 식료품
	private String gcName;
	private Integer gcCategory;
	private Integer gcPrice;
	private Integer gcStock;
	private Integer gcDelNy;
	private Integer gcUseNy;
	private String gcRegDateTime;
	private String gcModDateTime;
	
	// 거래처
	private String acName;
	private Integer acCategory;
	private String acManagerName;
	private String acManagerTel;
	private Integer acAddress;
	private String acAddressDetail;
	private String acStartDate;
	private String acEndDate;
	private Integer acUseNy;
	private Integer acDelNy;
	
	// 공장
	private String fcName;
	private String fcManagerName;
	private String fcTel;
	private Integer fcAddress;
	private String fcAddressDetail;
	private String fcRegDateTime;
	private String fcModDateTime;
	private Integer fcDelNy;
	private Integer fcUseNy;
	
	// code
	private String cd_seq;
	private String cdName;
	
//	*******************************
//	Getter, Setter
//	*******************************
	
	// 공통
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	
	// 식료품
	public String getGcName() {
		return gcName;
	}
	public void setGcName(String gcName) {
		this.gcName = gcName;
	}
	public Integer getGcCategory() {
		return gcCategory;
	}
	public void setGcCategory(Integer gcCategory) {
		this.gcCategory = gcCategory;
	}
	public Integer getGcPrice() {
		return gcPrice;
	}
	public void setGcPrice(Integer gcPrice) {
		this.gcPrice = gcPrice;
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
	
	// 거래처
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public Integer getAcCategory() {
		return acCategory;
	}
	public void setAcCategory(Integer acCategory) {
		this.acCategory = acCategory;
	}
	public String getAcManagerName() {
		return acManagerName;
	}
	public void setAcManagerName(String acManagerName) {
		this.acManagerName = acManagerName;
	}
	public String getAcManagerTel() {
		return acManagerTel;
	}
	public void setAcManagerTel(String acManagerTel) {
		this.acManagerTel = acManagerTel;
	}
	public Integer getAcAddress() {
		return acAddress;
	}
	public void setAcAddress(Integer acAddress) {
		this.acAddress = acAddress;
	}
	public String getAcAddressDetail() {
		return acAddressDetail;
	}
	public void setAcAddressDetail(String acAddressDetail) {
		this.acAddressDetail = acAddressDetail;
	}
	public String getAcStartDate() {
		return acStartDate;
	}
	public void setAcStartDate(String acStartDate) {
		this.acStartDate = acStartDate;
	}
	public String getAcEndDate() {
		return acEndDate;
	}
	public void setAcEndDate(String acEndDate) {
		this.acEndDate = acEndDate;
	}
	public Integer getAcUseNy() {
		return acUseNy;
	}
	public void setAcUseNy(Integer acUseNy) {
		this.acUseNy = acUseNy;
	}
	public Integer getAcDelNy() {
		return acDelNy;
	}
	public void setAcDelNy(Integer acDelNy) {
		this.acDelNy = acDelNy;
	}
	
	// 공장
	public String getFcName() {
		return fcName;
	}
	public void setFcName(String fcName) {
		this.fcName = fcName;
	}
	public String getFcManagerName() {
		return fcManagerName;
	}
	public void setFcManagerName(String fcManagerName) {
		this.fcManagerName = fcManagerName;
	}
	public String getFcTel() {
		return fcTel;
	}
	public void setFcTel(String fcTel) {
		this.fcTel = fcTel;
	}
	public Integer getFcAddress() {
		return fcAddress;
	}
	public void setFcAddress(Integer fcAddress) {
		this.fcAddress = fcAddress;
	}
	public String getFcAddressDetail() {
		return fcAddressDetail;
	}
	public void setFcAddressDetail(String fcAddressDetail) {
		this.fcAddressDetail = fcAddressDetail;
	}
	public String getFcRegDateTime() {
		return fcRegDateTime;
	}
	public void setFcRegDateTime(String fcRegDateTime) {
		this.fcRegDateTime = fcRegDateTime;
	}
	public String getFcModDateTime() {
		return fcModDateTime;
	}
	public void setFcModDateTime(String fcModDateTime) {
		this.fcModDateTime = fcModDateTime;
	}
	public Integer getFcDelNy() {
		return fcDelNy;
	}
	public void setFcDelNy(Integer fcDelNy) {
		this.fcDelNy = fcDelNy;
	}
	public Integer getFcUseNy() {
		return fcUseNy;
	}
	public void setFcUseNy(Integer fcUseNy) {
		this.fcUseNy = fcUseNy;
	}
	public Integer getGcStock() {
		return gcStock;
	}
	public void setGcStock(Integer gcStock) {
		this.gcStock = gcStock;
	}
	
	
	//
	public String getCd_seq() {
		return cd_seq;
	}
	public void setCd_seq(String cd_seq) {
		this.cd_seq = cd_seq;
	}
	public String getCdName() {
		return cdName;
	}
	public void setCdName(String cdName) {
		this.cdName = cdName;
	}
	
	
	
	
}
