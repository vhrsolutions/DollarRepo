package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "empincrement")

public class Increment extends AbstractEntity{
	
	@Id
	@Column(name = "empid")
	private int empid;
	
	
	@Column(name = "nextincdate")
	private String nxtincrdate;
	
	@Column(name = "nextincrate")
	private String nxtincrrate;
	
	
	public Increment(int empid,String nxtincrdate,String nxtincrrate)
	{
	this.empid=empid;
	this.nxtincrdate=nxtincrdate;
	this.nxtincrrate=nxtincrrate;
	}
	
	public Increment(){
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getNxtincrdate() {
		return nxtincrdate;
	}

	public void setNxtincrdate(String nxtincrdate) {
		this.nxtincrdate = nxtincrdate;
	}

	public String getNxtincrrate() {
		return nxtincrrate;
	}

	public void setNxtincrrate(String nxtincrrate) {
		this.nxtincrrate = nxtincrrate;
	}

	@Override
	public String toString() {
		return "Increment [empid=" + empid + ", nxtincrdate=" + nxtincrdate + ", nxtincrrate=" + nxtincrrate + "]";
	}

}
