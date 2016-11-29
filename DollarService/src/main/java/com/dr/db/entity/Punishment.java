package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity
@Table(name = "punishment")
public class Punishment extends AbstractEntity {

	public Punishment(int empId, String punishment, String finloss, String punishmentdate) {
		//super();
		this.empId = empId;
		this.punishment = punishment;
		this.finloss = finloss;
		this.punishmentdate = punishmentdate;
	}


	@Id
	@Column(name = "empid")
	private int empId;

	@Column(name = "punishment")
	private String punishment;

	@Column(name = "finloss")
	private String finloss;

	@Column(name = "punishmentdate")
	private String punishmentdate;

	public int getEmpid() {
		return empId;
	}

	public void setEmpid(int empId) {
		this.empId = empId;
	}

	public String getPunishment() {
		return punishment;
	}

	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}

	public String getFinloss() {
		return finloss;
	}

	public void setFinloss(String finloss) {
		this.finloss = finloss;
	}

	public String getPunishmentdate() {
		return punishmentdate;
	}

	public void setPunishmentdate(String punishmentdate) {
		this.punishmentdate = punishmentdate;
	}

	public Punishment() {

	}


	@Override
	public String toString() {
		return "Punishment [empid=" + empId + ", punishment=" + punishment + ", finloss=" + finloss
				+ ", punishmentdate=" + punishmentdate + "]";
	}

}
