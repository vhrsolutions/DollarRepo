package com.dr.db.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "contractor")

public class Contractor extends AbstractEntity {
	
	@Id
	@Column(name = "contractorid")
	private int contrid;
	
	
	@Column(name = "contractorname")
	private String contrName;
	
	@Column(name = "contractoraddress")
	private String contrAddress;
	
	@Column(name = "contractorphone")
	private String contrContact;
	
	@Column(name = "contractortin")
	private String contrTin;
	
	@Column(name = "contractorpan")
	private String contrPan;
	
	@Column(name = "contractorspoc")
	private String contrSpoc;
	
	
	public Contractor(String contrname,String contraddress, String contrnumber, String contrtin,String contrpan, String contrspoc ) {
	
		this.contrName=contrname;
		this.contrAddress=contraddress;
		this.contrContact=contrnumber;
		this.contrTin=contrtin;
		this.contrPan=contrpan;
		this.contrSpoc=contrspoc;
		

	}
	
	
	public Contractor() {		

	}

	public int getContrid() {
		return contrid;
	}


	public void setContrid(int contrid) {
		this.contrid = contrid;
	}


	public String getContrName() {
		return contrName;
	}


	public void setContrName(String contrName) {
		this.contrName = contrName;
	}


	public String getContrAddress() {
		return contrAddress;
	}


	public void setContrAddress(String contrAddress) {
		this.contrAddress = contrAddress;
	}


	public String getContrContact() {
		return contrContact;
	}


	public void setContrContact(String contrContact) {
		this.contrContact = contrContact;
	}


	public String getContrTin() {
		return contrTin;
	}


	public void setContrTin(String contrTin) {
		this.contrTin = contrTin;
	}


	public String getContrPan() {
		return contrPan;
	}


	public void setContrPan(String contrPan) {
		this.contrPan = contrPan;
	}


	public String getContrSpoc() {
		return contrSpoc;
	}


	public void setContrSpoc(String contrSpoc) {
		this.contrSpoc = contrSpoc;
	}


	@Override
	public String toString() {
		return "Contractor [contrid=" + contrid + ", contrname=" + contrName + ", contraddress=" + contrAddress
				+ ", contrnumber=" + contrContact + ", contrtin=" + contrTin + ", contrpan=" + contrPan + ", contrspoc="
				+ contrSpoc + "]";
	}


	


	
}

