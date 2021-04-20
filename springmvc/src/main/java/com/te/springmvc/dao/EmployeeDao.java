package com.te.springmvc.dao;

import java.util.List;

import com.te.springmvc.beans.EmployeeBean;

public interface EmployeeDao {

	public EmployeeBean authenticate(int id, String pwd);
	
	public EmployeeBean getEmployee(int id);
	
	public boolean deleteEmployee(int id);
	
	public List<EmployeeBean> getAllEmployees();
	
}
