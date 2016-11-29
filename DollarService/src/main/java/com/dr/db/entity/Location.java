package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "facility")
public class Location extends AbstractEntity {
	@Id
	@Column(name = "facilityid")
	private int locId;

	public int getLocId() {
		return locId;
	}

	public void setLocId(int locId) {
		this.locId = locId;
	}

	@Column(name = "loctin")
	private String locationName;

	@Column(name = "locaddress")
	private String locationAddress;
	
	@Column(name="locoperation")
	private String operationLocation;

	@Column(name = "locipfrom")
	private String ipAddtessFrom;

	@Column(name = "locipto")
	private String ipAddtessTo;

	@Column(name = "lochead")
	private String locationHead;

	@Column(name = "locspoc")
	private String pointOfContact;

	@Column(name = "locpolicecontact")
	private String policeContact;

	@Column(name = "loclabouroffice")
	private String labourOffice;

	public Location() {
	}

	public String getLocationName() {
		return locationName;
	}

	public String getLocationAddress() {
		return locationAddress;
	}

	public String getIpAddtessFrom() {
		return ipAddtessFrom;
	}

	public String getIpAddtessTo() {
		return ipAddtessTo;
	}

	public String getLocationHead() {
		return locationHead;
	}

	public String getPointOfContact() {
		return pointOfContact;
	}

	public String getPoliceContact() {
		return policeContact;
	}

	public String getLabourOffice() {
		return labourOffice;
	}

	

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public void setIpAddtessFrom(String ipAddtessFrom) {
		this.ipAddtessFrom = ipAddtessFrom;
	}

	public void setIpAddtessTo(String ipAddtessTo) {
		this.ipAddtessTo = ipAddtessTo;
	}

	public void setLocationHead(String locationHead) {
		this.locationHead = locationHead;
	}

	public void setPointOfContact(String pointOfContact) {
		this.pointOfContact = pointOfContact;
	}

	public void setPoliceContact(String policeContact) {
		this.policeContact = policeContact;
	}

	public void setLabourOffice(String labourOffice) {
		this.labourOffice = labourOffice;
	}

	public String getOperationLocation() {
		return operationLocation;
	}

	public void setOperationLocation(String operationLocation) {
		this.operationLocation = operationLocation;
	}

	public Location(String locationName, String locationAddress, String ipAddtessFrom, String ipAddtessTo,
			String locationHead, String pointOfContact, String policeContact, String labourOffice,String operationLocation) {
		super();
		this.locationName = locationName;
		this.locationAddress = locationAddress;
		this.ipAddtessFrom = ipAddtessFrom;
		this.ipAddtessTo = ipAddtessTo;
		this.locationHead = locationHead;
		this.pointOfContact = pointOfContact;
		this.policeContact = policeContact;
		this.labourOffice = labourOffice;
		this.operationLocation = operationLocation;
	}

	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locationName=" + locationName + ", locationAddress=" + locationAddress
				+ ", ipAddtessFrom=" + ipAddtessFrom + ", ipAddtessTo=" + ipAddtessTo + ", locationHead=" + locationHead
				+ ", pointOfContact=" + pointOfContact + ", policeContact=" + policeContact + ", labourOffice="
				+ labourOffice + "]";
	}
	

}
