package com.dr.dto;

import com.dr.common.dto.DRBaseDTO;

public class IncrementDetailsDTO extends DRBaseDTO {
	public int empID;
	public String nxtDate;
	public String incrRate;
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	} 
	public String getNxtDate() {
		return nxtDate;
	}
	public void setNxtDate(String nxtDate) {
		this.nxtDate = nxtDate;
	}
	public String getIncrRate() {
		return incrRate;
	}
	public void setIncrRate(String incrRate) {
		this.incrRate = incrRate;
	}

}
