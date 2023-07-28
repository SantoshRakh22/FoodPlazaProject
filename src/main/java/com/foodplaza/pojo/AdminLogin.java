package com.foodplaza.pojo;

public class AdminLogin {
	private String aEmailId;
	private String AdminPassword;
	public String getaEmailId() {
		return aEmailId;
	}
	public void setaEmailId(String aEmailId) {
		this.aEmailId = aEmailId;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "AdminLogin [aEmailId=" + aEmailId + ", AdminPassword=" + AdminPassword + "]";
	}
	

}
