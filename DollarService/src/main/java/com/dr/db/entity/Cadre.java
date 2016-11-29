package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "cadre")
public class Cadre extends AbstractEntity {

	@Id
	@Column(name="cadrecode")
	private int cadrecode;
	
	public int getCadrecode() {
		return cadrecode;
	}

	public void setCadrecode(int cadrecode) {
		this.cadrecode = cadrecode;
	}

	@Column(name = " cadre ")
	private String cadreName;

	@Column(name = "minsal")
	private String minimumSalary;

	@Column(name = "maxsal")
	private String maximumSalary;

	@Column(name = "car")
	private String carEligible;

	@Column(name = "bike")
	private String bikeEligible;

	@Column(name = "eduqual")
	private String educationalQualification;

	@Column(name = "experience")
	private String experienceRequired;

	@Column(name = "skills")
	private String skillsRequired;

	@Column(name = "shiftproductivity")
	private String shiftproductivity;

	@Column(name = "monthproductivity")
	private String monthproductivity;

	public String getCadreName() {
		return cadreName;
	}

	public String getMinimumSalary() {
		return minimumSalary;
	}

	public String getMaximumSalary() {
		return maximumSalary;
	}

	public String getCarEligible() {
		return carEligible;
	}

	public String getBikeEligible() {
		return bikeEligible;
	}

	public String getEducationalQualification() {
		return educationalQualification;
	}

	public String getExperienceRequired() {
		return experienceRequired;
	}

	public String getSkillsRequired() {
		return skillsRequired;
	}

	public String getShiftproductivity() {
		return shiftproductivity;
	}

	public String getMonthproductivity() {
		return monthproductivity;
	}

	public void setCadreName(String cadreName) {
		this.cadreName = cadreName;
	}

	public void setMinimumSalary(String minimumSalary) {
		this.minimumSalary = minimumSalary;
	}

	public void setMaximumSalary(String maximumSalary) {
		this.maximumSalary = maximumSalary;
	}

	public void setCarEligible(String carEligible) {
		this.carEligible = carEligible;
	}

	public void setBikeEligible(String bikeEligible) {
		this.bikeEligible = bikeEligible;
	}
	public void setExperiencerequired(String experiencerequired) {
		this.experienceRequired = experiencerequired;
	}


	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}

	public void setExperienceRequired1(String experienceRequired) {
		this.experienceRequired = experienceRequired;
	}

	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	public void setShiftproductivity(String shiftproductivity) {
		this.shiftproductivity = shiftproductivity;
	}

	public void setMonthproductivity(String monthproductivity) {
		this.monthproductivity = monthproductivity;
	}

	public Cadre(String cadreName, String minimumSalary, String maximumSalary, String carEligible, String bikeEligible,
			String educationalQualification, String experienceRequired, String skillsRequired, String shiftproductivity,
			String monthproductivity) {
		super();
		this.cadreName = cadreName;
		this.minimumSalary = minimumSalary;
		this.maximumSalary = maximumSalary;
		this.carEligible = carEligible;
		this.bikeEligible = bikeEligible;
		this.educationalQualification = educationalQualification;
		this.experienceRequired = experienceRequired;
		this.skillsRequired = skillsRequired;
		this.shiftproductivity = shiftproductivity;
		this.monthproductivity = monthproductivity;
	}

	@Override
	public String toString() {
		return "Cadre [cadreName=" + cadreName + ", minimumSalary=" + minimumSalary + ", maximumSalary=" + maximumSalary
				+ ", carEligible=" + carEligible + ", bikeEligible=" + bikeEligible + ", educationalQualification="
				+ educationalQualification + ", experienceRequired=" + experienceRequired + ", skillsRequired="
				+ skillsRequired + ", shiftproductivity=" + shiftproductivity + ", monthproductivity="
				+ monthproductivity + "]";
	}

	public Cadre() {
	}

	public void setExperienceRequired(String experienceRequired2) {
		// TODO Auto-generated method stub
		
	}
}
