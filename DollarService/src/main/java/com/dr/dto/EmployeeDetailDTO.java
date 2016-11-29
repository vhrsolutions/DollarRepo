package com.dr.dto;

import com.dr.common.dto.DRBaseDTO;

public class EmployeeDetailDTO extends DRBaseDTO {

	private String empId;
	private String firstName;
	private String middleName;
	private String lastName;
	private int cadreId;
	private int deptID;
	private  String aadharNumber;
	private  String panNumber;
	private  int bankId;
	private  String bankAccNumber;
	private  int contractorId;
	private  int facilityId;
	private  String supervisorId;
	private  String dateOfBirth;
	private  String dateOfJoining;
	private  String dateOfLeaving;
	private  String eduQualification;
	private  String emailId;
	private  String bloodGrp;
	private  String employmentType;
	private  String status;
	private  String gender;
	private  int prevExperience;
	private  String college;
	private  char hostelier='N';
	private  String nationality;
	private  char handicapped='N';
	private  String handicapDetails;
	private char empActive = 'Y';

	private AddressDTO addressDTO;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCadreId() {
		return cadreId;
	}

	public void setCadreId(int cadreId) {
		this.cadreId = cadreId;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDateOfLeaving() {
		return dateOfLeaving;
	}

	public void setDateOfLeaving(String dateOfLeaving) {
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

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}


}
