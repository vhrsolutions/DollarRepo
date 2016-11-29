/**
 *
 */
package com.dr.db.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "Employee")
public class Employee extends AbstractEntity {
	@Id
	@GeneratedValue
	@Column(name = "emppk")
	private int empId;

	@Column(name = "empname")
	private String firstName;
	
	@Column(name = "company")
	private String company="DL";

	@Column(name = "empcadre")
	private int cadreId;

	@Column(name = "empdepartment")
	private int deptID;

	@Column(name = "empaadhar")
	private  String aadharNumber;
	
	@Column(name = "emppan")
	private  String panNumber;
	
	@Column(name = "empvoterid")
	private  String voterId;
	
	@Column(name = "empbank")
	private  int bankId;
	
	@Column(name = "empbankaccno")
	private  String bankAccNumber;
	
	@Column(name = "empcontractor")
	private  int contractorId;
	
	@Column(name = "empfacility")
	private  int facilityId;
	
	@Column(name = "empboss")
	private  String supervisorId;
	
	@Column(name = "empdob")
	private  Date dateOfBirth;

	@Column(name = "empdoj")
	private  Date dateOfJoining;

	@Column(name = "empdol")
	private  Date dateOfLeaving;
	
	@Column(name = "empeduqual")
	private  String eduQualification;
	
	@Column(name = "empemail")
	private  String emailId;
	
	@Column(name = "empbloodgrp")
	private  String bloodGrp;
	
	@Column(name = "emptype")
	private  String employmentType;
	
	@Column(name = "empstatus")
	private  String status;
	
	@Column(name = "empgender")
	private  String gender;
	
	@Column(name = "empprevexp")
	private  int prevExperience;
	
	@Column(name = "empcollege")
	private  String college;
	
	@Column(name = "emphostelier")
	private  char hostelier='N';
	
	@Column(name = "empnationality")
	private  String nationality;
	
	@Column(name = "emphandicapped")
	private  char handicapped='N';
	
	@Column(name = "emphandicapdets")
	private  String handicapDetails;
	
	@Column(name="empactive")
	private char empActive = 'Y';

	public Employee(){
	
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getCadreId() {
		return cadreId;
	}

	public void setCadreId(int cadreId) {
		this.cadreId = cadreId;
	}
	

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(String bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public int getContractorId() {
		return contractorId;
	}

	public void setContractorId(int contractorId) {
		this.contractorId = contractorId;
	}

	public int getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfLeaving() {
		return dateOfLeaving;
	}

	public void setDateOfLeaving(Date dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}

	public String getEduQualification() {
		return eduQualification;
	}

	public void setEduQualification(String eduQualification) {
		this.eduQualification = eduQualification;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPrevExperience() {
		return prevExperience;
	}

	public void setPrevExperience(int prevExperience) {
		this.prevExperience = prevExperience;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public char getHostelier() {
		return hostelier;
	}

	public void setHostelier(char hostelier) {
		this.hostelier = hostelier;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public char getHandicapped() {
		return handicapped;
	}

	public void setHandicapped(char handicapped) {
		this.handicapped = handicapped;
	}

	public String getHandicapDetails() {
		return handicapDetails;
	}

	public void setHandicapDetails(String handicapDetails) {
		this.handicapDetails = handicapDetails;
	}

	public char getEmpActive() {
		return empActive;
	}

	public void setEmpActive(char empActive) {
		this.empActive = empActive;
	}
	
}
