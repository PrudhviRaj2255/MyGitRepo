package com.te.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.te.springmvc.beans.EmployeeBean;
import com.te.springmvc.dao.EmployeeDao;
import com.te.springmvc.dao.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao = new EmployeeDaoImpl();
	
	@Override
	public EmployeeBean authenticate(int id, String pwd) {
		
		return dao.authenticate(id, pwd);
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		
		return dao.getEmployee(id);
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		return dao.deleteEmployee(id);
	}

	@Override
	public List<EmployeeBean> getAllEmployees() {
		
		return dao.getAllEmployees();
	}
	
	

}
