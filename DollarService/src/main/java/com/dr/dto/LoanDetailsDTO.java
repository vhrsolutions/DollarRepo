package com.dr.dto;

import com.dr.common.dto.DRBaseDTO;

public class LoanDetailsDTO extends DRBaseDTO{

	//pojo class for loan module
	private String loanDesc;
	private String maxLoanAmount;
	private String maxNumOfInst;
	private String loanInterest;
	private String interestRate;
	private String nextLoanAvailability;
	
	public String getLoanDesc() {
		return loanDesc;
	}
	public void setLoanDesc(String loanDesc) {
		this.loanDesc = loanDesc;
	}
	public String getMaxLoanAmount() {
		return maxLoanAmount;
	}
	public void setMaxLoanAmount(String maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}
	public String getMaxNumOfInst() {
		return maxNumOfInst;
	}
	public void setMaxNumOfInst(String maxNumOfInst) {
		this.maxNumOfInst = maxNumOfInst;
	}
	public String getLoanInterest() {
		return loanInterest;
	}
	public void setLoanInterest(String loanInterest) {
		this.loanInterest = loanInterest;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getNextLoanAvailability() {
		return nextLoanAvailability;
	}
	public void setNextLoanAvailability(String nextLoanAvailability) {
		this.nextLoanAvailability = nextLoanAvailability;
	}
	
}
