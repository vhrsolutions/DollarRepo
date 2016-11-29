package com.dr.db.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "empattendance")
public class EmployeeAttendance extends AbstractEntity{

	@Id
	@Column(name = "empid")
	private String empId;
	
	@Column(name = "xndate")
	private Date shiftDate;
	
	@Column(name="hrsworked")
	private double hoursWorked;
	
	public EmployeeAttendance() {
	}
	
	public EmployeeAttendance(String empId, Date shiftDate,double hoursWorked){
		this.empId= empId;
		this.shiftDate = shiftDate;
		this.hoursWorked = hoursWorked;
	}

	public Date getShiftDate() {
		return shiftDate;
	}

	public void setShiftDate(Date shiftDate) {
		this.shiftDate = shiftDate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	
}
