/**
 * 
 */
package com.dr.bean;

/**
 * @author Vaishnavie
 *
 */
public class DepartmentDetails {
	
	int deptId;
	String deptName;
	String deptHead;
	String deptFunction;
	
	public DepartmentDetails(int deptId, String deptName, String deptHead, String deptFunction ){
		this.deptId = deptId;
		this.deptName =deptName;
		this.deptHead= deptHead;
		this.deptFunction = deptFunction;
	}
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	public String getDeptFunction() {
		return deptFunction;
	}
	public void setDeptFunction(String deptFunction) {
		this.deptFunction = deptFunction;
	}
	
	

}
