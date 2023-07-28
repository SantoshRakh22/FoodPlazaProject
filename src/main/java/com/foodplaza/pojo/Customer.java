package com.foodplaza.pojo;

public class Customer {
	private String customerName;
	private String cEmailId;
	private String cPassword;
	private String cAddress;
	private String cContactNo;
	
	public Customer() {
		super();
	}

	public Customer(String customerName, String cEmailId, String cPassword, String cAddress, String cContactNo) {
		super();
		this.customerName = customerName;
		this.cEmailId = cEmailId;
		this.cPassword = cPassword;
		this.cAddress = cAddress;
		this.cContactNo = cContactNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getcEmailId() {
		return cEmailId;
	}

	public void setcEmailId(String cEmailId) {
		this.cEmailId = cEmailId;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcContactNo() {
		return cContactNo;
	}

	public void setcContactNo(String cContactNo) {
		this.cContactNo = cContactNo;
	}

	@Override
	public String toString() {
		return "CustomerNo [customerName=" + customerName + ", cEmailId=" + cEmailId + ", cPassword=" + cPassword
				+ ", cAddress=" + cAddress + ", cContactNo=" + cContactNo + "]";
	}
	
	
	
	

}
