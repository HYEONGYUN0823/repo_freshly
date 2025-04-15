package com.a7a7.module.member;

import java.util.List;

public class MemberDto {
	
	private String seq;
	private String mbName;
	private String mbId;
	private String mbPassword;
	private String mbEmail;
	private String mbRegDateTime;
	private String mbModDateTime;
	private Integer mbDelNy;
	
	private List<Integer> seqs;  // uelete 메서드를 위한 공통 seqs.
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getMbName() {
		return mbName;
	}
	public void setMbName(String mbName) {
		this.mbName = mbName;
	}
	public String getMbId() {
		return mbId;
	}
	public void setMbId(String mbId) {
		this.mbId = mbId;
	}
	public String getMbPassword() {
		return mbPassword;
	}
	public void setMbPassword(String mbPassword) {
		this.mbPassword = mbPassword;
	}
	public String getMbEmail() {
		return mbEmail;
	}
	public void setMbEmail(String mbEmail) {
		this.mbEmail = mbEmail;
	}
	public String getMbRegDateTime() {
		return mbRegDateTime;
	}
	public void setMbRegDateTime(String mbRegDateTime) {
		this.mbRegDateTime = mbRegDateTime;
	}
	public String getMbModDateTime() {
		return mbModDateTime;
	}
	public void setMbModDateTime(String mbModDateTime) {
		this.mbModDateTime = mbModDateTime;
	}
	public Integer getMbDelNy() {
		return mbDelNy;
	}
	public void setMbDelNy(Integer mbDelNy) {
		this.mbDelNy = mbDelNy;
	}
	public List<Integer> getSeqs() {
		return seqs;
	}
	public void setSeqs(List<Integer> seqs) {
		this.seqs = seqs;
	}
	
}
