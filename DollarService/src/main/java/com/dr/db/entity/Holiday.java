package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "holiday")

public class Holiday extends AbstractEntity {

	@Id
	@Column(name = "holidayid")
	private int holidayId;

	@Column(name = "holidaydesc")
	private String holdesc;

	@Column(name = "holidaydate")
	private String holDate;

	/*@Column(name = "holidaycadre")
	private String holcadre;*/
	
	public Holiday(String holDesc, String holDate) {
		this.holdesc = holDesc;
		this.holDate = holDate;
		
		
   
	

	}

	public Holiday() {
		// TODO Auto-generated constructor stub

	}

	public String getHoldesc() {
		return holdesc;
	}

	public void setHoldesc(String holdesc) {
		this.holdesc = holdesc;
	}

	public String getHolDate() {
		return holDate;
	}

	public void setHolDate(String holDate) {
		this.holDate = holDate;
	}

	@Override
	public String toString() {
		return "Holiday [holidayId=" + holidayId + ", holdesc=" + holdesc + ", holDate=" + holDate + "]";
	}

}
