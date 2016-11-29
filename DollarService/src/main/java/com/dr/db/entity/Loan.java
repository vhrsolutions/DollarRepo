package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "loan")
public class Loan extends AbstractEntity {

	@Id
	@Column(name = "loanid")
	private int loanid;

	@Column(name = "loandescription")
	private String loandescription;

	@Column(name = "maxloanamount")
	private String maxloanamount;

	@Column(name = "maxloaninstalment")
	private String maxloaninstalment;

	@Column(name = "loaninterest")
	private String loaninterest;

	@Column(name = "loaninterestrate")
	private String loaninterestrate;

	@Column(name = "loangap")
	private String loangap;

	public int getLoanid() {
		return loanid;
	}

	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}

	public String getLoandescription() {
		return loandescription;
	}

	public void setLoandescription(String loandescription) {
		this.loandescription = loandescription;
	}

	public String getMaxloanamount() {
		return maxloanamount;
	}

	public void setMaxloanamount(String maxloanamount) {
		this.maxloanamount = maxloanamount;
	}

	public String getMaxloaninstalment() {
		return maxloaninstalment;
	}

	public void setMaxloaninstalment(String maxloaninstalment) {
		this.maxloaninstalment = maxloaninstalment;
	}

	public String getLoaninterest() {
		return loaninterest;
	}

	public void setLoaninterest(String loaninterest) {
		this.loaninterest = loaninterest;
	}

	public String getLoaninterestrate() {
		return loaninterestrate;
	}

	public void setLoaninterestrate(String loaninterestrate) {
		this.loaninterestrate = loaninterestrate;
	}

	public String getLoangap() {
		return loangap;
	}

	public void setLoangap(String loangap) {
		this.loangap = loangap;
	}

	public Loan() {

	}

	public Loan( String loandescription, String maxloanamount, String maxloaninstalment, String loaninterest,
			String loaninterestrate, String loangap) {
		
		
		this.loandescription = loandescription;
		this.maxloanamount = maxloanamount;
		this.maxloaninstalment = maxloaninstalment;
		this.loaninterest = loaninterest;
		this.loaninterestrate = loaninterestrate;
		this.loangap = loangap;
	}

	@Override
	public String toString() {
		return "Loan [loanid=" + loanid + ", loandescription=" + loandescription + ", maxloanamount=" + maxloanamount
				+ ", maxloaninstalment=" + maxloaninstalment + ", loaninterest=" + loaninterest + ", loaninterestrate="
				+ loaninterestrate + ", loangap=" + loangap + "]";
	}

	

}
