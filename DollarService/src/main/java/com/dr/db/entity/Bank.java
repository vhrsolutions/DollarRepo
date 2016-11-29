package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "bank")

public class Bank extends AbstractEntity {
	
	@Id
	@Column(name = "bankid")
	private int bankid;
	
	
	@Column(name = "bankname")
	private String bankname;
	
	@Column(name = "branch")
	private String branchname;
	
	@Column(name = "ifsc")
	private String ifsccode;
	
	@Column(name = "micr")
	private String micrcode;
	
	@Column(name = "contact")
	private String contact;
	
	/*@Column(name = "recinsertedby")
	private String insertedby;
	

	@Column(name = "recinsertedon")
	private String insertedon;
	*/

	
	
	



public Bank(String bankname,String branchname, String ifsccode, String micrcode,String contact ) {
	/*this.bankid=bankid;*/
	this.bankname=bankname;
	this.branchname=branchname;
	this.ifsccode=ifsccode;
	this.micrcode=micrcode;
	this.contact=contact;
	/*this.insertedby=insertedby;
	this.insertedon=insertedon;*/

}

public Bank(){	
	
}








public String getBankname() {
	return bankname;
}

public void setBankname(String bankname) {
	this.bankname = bankname;
}

public String getBranchname() {
	return branchname;
}

public void setBranchname(String branchname) {
	this.branchname = branchname;
}

public String getIfsccode() {
	return ifsccode;
}

public void setIfsccode(String ifsccode) {
	this.ifsccode = ifsccode;
}

public String getMicrcode() {
	return micrcode;
}

public void setMicrcode(String micrcode) {
	this.micrcode = micrcode;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

@Override
public String toString() {
	return "Bank [bankid=" + bankid + ", bankname=" + bankname + ", branchname=" + branchname + ", ifsccode=" + ifsccode
			+ ", micrcode=" + micrcode + ", contact=" + contact + "]";
}



}



