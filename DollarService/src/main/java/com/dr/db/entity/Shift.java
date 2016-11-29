package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "shift")
public class Shift extends AbstractEntity {

	@Id
	@Column(name = "shiftid")
	private int shiftid;

	@Column(name = "fromtime")
	private String fromTime;

	@Column(name = "totime")
	private String toTime;

	@Column(name = "shifthrs")
	private String shifthrs;

	
	
	public int getShiftid() {
		return shiftid;
	}

	public void setShiftid(int shiftid) {
		this.shiftid = shiftid;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getShifthrs() {
		return shifthrs;
	}

	public void setShifthrs(String shifthrs) {
		this.shifthrs = shifthrs;
	}

	public Shift(String fromTime, String toTime, String shifthrs) {

		
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.shifthrs = shifthrs;
	}
	public Shift(){
		
	}

	@Override
	public String toString() {
		return "Shift [shiftid=" + shiftid + ", fromTime=" + fromTime + ", " + "toTime=" + toTime + ", shifthrs="
				+ shifthrs + "]";

	}

}
