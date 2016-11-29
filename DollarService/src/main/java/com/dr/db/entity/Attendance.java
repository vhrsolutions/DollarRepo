package com.dr.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dr.common.db.AbstractEntity;

@Entity

@Table(name = "Attendance")
public class Attendance extends AbstractEntity  {

	@Id
	@Column(name = "atdid")
	private int atdid;

	@Column(name = "date")
	private String date;
	@Column(name = "empid")
	private String empid;

	@Column(name = "empname")
	private String empname;

	@Column(name = "depname")
	private String depname;

	@Column(name = "shiftIn")
	private String shiftIn;

	@Column(name = "shiftOut")
	private String shiftOut;

	@Column(name = "present")
	private String present;
	@Column(name = "absent")
	private String absent;

	@Column(name = "leave")
	private String leave;

	@Column(name = "tour")
	private String tour;

	public Attendance() {
	}

	public int getAtdid() {
		return atdid;
	}

	public void setAtdid(int atdid) {
		this.atdid = atdid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getShiftIn() {
		return shiftIn;
	}

	public void setShiftIn(String shiftIn) {
		this.shiftIn = shiftIn;
	}

	public String getShiftOut() {
		return shiftOut;
	}

	public void setShiftOut(String shiftOut) {
		this.shiftOut = shiftOut;
	}

	public String getPresent() {
		return present;
	}

	public void setPresent(String present) {
		this.present = present;
	}

	public String getAbsent() {
		return absent;
	}

	public void setAbsent(String absent) {
		this.absent = absent;
	}

	public String getLeave() {
		return leave;
	}

	public void setLeave(String leave) {
		this.leave = leave;
	}

	public String getTour() {
		return tour;
	}

	public void setTour(String tour) {
		this.tour = tour;
	}

	@Override
	public String toString() {
		return "Attendance [atdid=" + atdid + ", date=" + date + ", empid=" + empid + ", empname=" + empname
				+ ", depName=" + depname + ", shiftIn=" + shiftIn + ", shiftOut=" + shiftOut + ", present=" + present
				+ ", absent=" + absent + ", leave=" + leave + ", tour=" + tour + "]";
	}

	public Attendance( String date, String empid, String empname, String depname, String shiftIn,
			String shiftOut, String present, String absent, String leave, String tour) {
		
		this.date = date;
		this.empid = empid;
		this.empname = empname;
		this.depname = depname;
		this.shiftIn = shiftIn;
		this.shiftOut = shiftOut;
		this.present = present;
		this.absent = absent;
		this.leave = leave;
		this.tour = tour;
	}

}
