package com.dr.bean;

public class EmploymentType {

	String empCode;
	String employementType;

	public EmploymentType(final String empCode, final String employmentType) {
		this.empCode = empCode;
		this.employementType = employmentType;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(final String empCode) {
		this.empCode = empCode;
	}

	public String getEmployementType() {
		return employementType;
	}

	public void setEmployementType(final String employementType) {
		this.employementType = employementType;
	}

}
