package com.dr.bean;

public class EmployeeSepforPay {

	String payProcessCode;
	String payProcess;

	public EmployeeSepforPay(String string1, String string2) {
		this.payProcessCode=string1;
		this.payProcess=string2;
	}

	public String getPayProcessCode() {
		return payProcessCode;
	}

	public void setPayProcessCode(String payProcessCode) {
		this.payProcessCode = payProcessCode;
	}

	public String getPayProcess() {
		return payProcess;
	}

	public void setPayProcess(String payProcess) {
		this.payProcess = payProcess;
	}

	

}
