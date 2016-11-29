package com.dr.bean;

public class EmployeeSepForDate {
	
	// date fields
	public String resignationDate;
	public String lastWorkingDay;
	
	public EmployeeSepForDate(final String resignationDate, final String lastWorkingDay){
		this.resignationDate = resignationDate;
		this.lastWorkingDay = lastWorkingDay;
		
	}

	public String getResignationDate(){
		return resignationDate;
	}

	public void setResignationDate(final String resignationDate) {
		this.resignationDate = resignationDate;
	}

	public String getLastWorkingDay(){
		return lastWorkingDay;
	}
	 public void setLastWorkingDay(final String lastWorkingDay){
		 this.lastWorkingDay = lastWorkingDay;
	 }
}
