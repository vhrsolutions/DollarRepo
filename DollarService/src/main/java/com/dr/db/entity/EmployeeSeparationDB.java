package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "emp_sep")
public class EmployeeSeparationDB extends AbstractEntity {

	@Id
	@Column(name = "empid")
	private String empId;

	@Column(name = "exitType")
	private String exitType;

	@Column(name = "resnation")
	private String resignationDate;

	@Column(name = "lastday")
	private String lastWorkingDay;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "reasonforexit")
	private String reasonForExit;

	@Column(name = "payprocess")
	private String payProcessType;

	@Column(name = "notice")
	private String noticeWaiver;

  private String elgibleForReEmployeement;
	private String dismissal;
	private String salarytobepaidforDays;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getExitType() {
		return exitType;
	}

	public void setExitType(String exitType) {
		this.exitType = exitType;
	}

	public String getResignationDtae() {
		return resignationDate;
	}

	public void setResignationDate(String resignationDate) {
		this.resignationDate = resignationDate;
	}

	public String getLastWorkingDay() {
		return lastWorkingDay;
	}

	public void setLastWorkingDay(String lastWorkingDay) {
		this.lastWorkingDay = lastWorkingDay;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReasonForExit() {
		return reasonForExit;
	}

	public void setReasonForExit(String reasonForExit) {
		this.reasonForExit = reasonForExit;
	}

	public String getPayProcessType() {
		return payProcessType;
	}

	public void setPayProcessType(String payProcessType) {
		this.payProcessType = payProcessType;
	}

	public String getNoticeWaiver() {
		return noticeWaiver;
	}

	public void setNoticeWaiver(String noticeWaiver) {
		this.noticeWaiver = noticeWaiver;
	}

	public String getElgibleForReEmployeement() {
		return elgibleForReEmployeement;
	}

	public void setElgibleForReEmployeement(String elgibleForReEmployeement) {
		this.elgibleForReEmployeement = elgibleForReEmployeement;
	}

	public String getDismissal() {
		return dismissal;
	}

	public void setDismissal(String dismissal) {
		this.dismissal = dismissal;
	}

	public String getSalarytobepaidforDays() {
		return salarytobepaidforDays;
	}

	public void setSalarytobepaidforDays(String salarytobepaidforDays) {
		this.salarytobepaidforDays = salarytobepaidforDays;
	}

	public String getResignationDate() {
		return resignationDate;
	}

	public EmployeeSeparationDB() {

	}
	

	public EmployeeSeparationDB(String empId, String exitType, String lastWorkingDay, String reasonforExit,
			String remarks, String resignationDate, String payProcess, String noticewaiver, String salarytobePaidforDays) {

		this.empId = empId;
		this.exitType = exitType;
		this.resignationDate = resignationDate;
		this.lastWorkingDay = lastWorkingDay;
		this.remarks = remarks;
		this.reasonForExit = reasonforExit;
		this.payProcessType = payProcess;
		this.noticeWaiver = noticewaiver;

	}

	@Override
	public String toString() {
		return "EmployeeSeparationDB [empId=" + empId + ", exitType=" + exitType + ", resignationDate="
				+ resignationDate + ", lastWorkingDay=" + lastWorkingDay + ", remarks=" + remarks + ", reasonforExit="
				+ reasonForExit + ", payProcess=" + payProcessType + ", noticewaiver=" + noticeWaiver + "]";
	}

}
