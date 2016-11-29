package com.dr.service;

import com.dr.db.entity.EmployeeSeparationDB;
import com.dr.dto.EmployeeDetailDTO;
import com.dr.dto.EmployeeShiftDetailDTO;

public interface EmployeeService {

	public void createEmployeeDetails(EmployeeDetailDTO empDetDTO);

	public void modifyEmployeeShiftTime(EmployeeShiftDetailDTO empShiftDetailDTO);

	public void createEmployeeSeparation(EmployeeSeparationDB empSepDetailDTO);

	
	// public List<EmployeeSepforPay> getEmployeeSepforPay();

}
