package com.web.soulyogaadmin.entity;
// Generated 2017-6-22 13:56:57 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.List;

/**
 * Classroom generated by hbm2java
 */
public class Classroom implements java.io.Serializable {

	private Integer id;
	private String classroomNo;
	private int yogaCludId;
	private Date createdTime;
	private Date modifiedTime;
	private int state;
	public Classroom() {
	}

	public Classroom(String classroomNo, int yogaCludId, Date createdTime, int state) {
		this.classroomNo = classroomNo;
		this.yogaCludId = yogaCludId;
		this.createdTime = createdTime;
		this.state = state;
	}

	public Classroom(String classroomNo, int yogaCludId, Date createdTime, Date modifiedTime, int state) {
		this.classroomNo = classroomNo;
		this.yogaCludId = yogaCludId;
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

	public String getClassroomNo() {
		return this.classroomNo;
	}

	public void setClassroomNo(String classroomNo) {
		this.classroomNo = classroomNo;
	}

	public int getYogaCludId() {
		return this.yogaCludId;
	}

	public void setYogaCludId(int yogaCludId) {
		this.yogaCludId = yogaCludId;
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

	@Override
	public String toString() {
		return "Classroom [id=" + id + ", classroomNo=" + classroomNo + ", yogaCludId=" + yogaCludId + ", createdTime="
				+ createdTime + ", modifiedTime=" + modifiedTime + ", state=" + state + "]";
	}

}
