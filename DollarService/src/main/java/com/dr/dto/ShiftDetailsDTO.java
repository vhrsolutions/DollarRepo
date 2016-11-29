package com.dr.dto;

import com.dr.common.dto.DRBaseDTO;

public class ShiftDetailsDTO  extends DRBaseDTO{

	//pojo class for shift module
	private String shiftFromTime;
	private String shiftToTime;
	private String shiftHrs;
		
	

	public String getShiftFromTime() {
		return shiftFromTime;
	}
	
	public void setShiftFromTime(String shiftFromTime) {
		this.shiftFromTime = shiftFromTime;
	}
	
	public String getShiftToTime() {
		return shiftToTime;
	}
	
	public void setShiftToTime(String shiftToTime) {
		this.shiftToTime = shiftToTime;
	}
	
	public String getShiftHrs() {
		return shiftHrs;
	}
	
	public void setShiftHrs(String shiftHrs) {
		this.shiftHrs = shiftHrs;
	}

	
	
}
