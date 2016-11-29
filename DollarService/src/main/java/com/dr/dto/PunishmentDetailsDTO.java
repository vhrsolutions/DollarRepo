package com.dr.dto;

public class PunishmentDetailsDTO {

	// pojo class for punishment module

	private int empId;
	private String punishment;
	private String financialLoss;
	private String punishDate;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getPunishment() {
		return punishment;
	}

	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}

	public String getFinancialLoss() {
		return financialLoss;
	}

	public void setFinancialLoss(String financialLoss) {
		this.financialLoss = financialLoss;
	}

	public String getPunishDate() {
		return punishDate;
	}

	public void setPunishDate(String punishDate) {
		this.punishDate = punishDate;
	}

}
