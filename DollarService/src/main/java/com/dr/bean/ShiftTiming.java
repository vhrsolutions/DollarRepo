package com.dr.bean;

public class ShiftTiming {

	public String shiftID;
	public String startTime;
	public String endTime;

	public ShiftTiming(final String shiftID, final String startTime, final String endTime) {
		this.shiftID = shiftID;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getShiftID() {
		return shiftID;
	}

	public void setShiftID(final String shiftID) {
		this.shiftID = shiftID;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(final String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(final String endTime) {
		this.endTime = endTime;
	}

}
