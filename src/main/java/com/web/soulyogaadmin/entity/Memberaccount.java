package com.web.soulyogaadmin.entity;
// Generated 2017-6-22 13:56:57 by Hibernate Tools 5.2.3.Final

import java.util.Date;

/**
 * Memberaccount generated by hbm2java
 */
public class Memberaccount implements java.io.Serializable {

	private Integer id;
	private int memberId;
	private String nickName;
	private String password;
	private byte[] fingerprint;
	private Date createdTime;
	private Date modifiedTime;
	private int state;

	public Memberaccount() {
	}

	public Memberaccount(int memberId, String password, byte[] fingerprint, Date createdTime, int state) {
		this.memberId = memberId;
		this.password = password;
		this.fingerprint = fingerprint;
		this.createdTime = createdTime;
		this.state = state;
	}

	public Memberaccount(int memberId, String nickName, String password, byte[] fingerprint, Date createdTime,
			Date modifiedTime, int state) {
		this.memberId = memberId;
		this.nickName = nickName;
		this.password = password;
		this.fingerprint = fingerprint;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.state = state;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getFingerprint() {
		return this.fingerprint;
	}

	public void setFingerprint(byte[] fingerprint) {
		this.fingerprint = fingerprint;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
