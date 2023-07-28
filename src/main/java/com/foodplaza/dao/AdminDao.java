package com.foodplaza.dao;

public interface AdminDao  {
boolean userLogin(String emailId,String password);
boolean userChangePassword(String emailId,String newPassword);
boolean adminLogin(String adminEmailid, String adminPassword);
boolean adminChangePassword(String adminEmailid,String newAdminPassword);

}
