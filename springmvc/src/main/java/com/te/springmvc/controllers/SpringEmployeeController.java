package com.te.springmvc.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.springmvc.beans.EmployeeBean;
import com.te.springmvc.service.EmployeeService;

@Controller
public class SpringEmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/employeelogin")
	public String login() {
		return "Login";
	}

	@PostMapping("/empLogin")
	public String empAuthenticate(int id, String pwd, HttpServletRequest request, ModelMap map) {

		EmployeeBean bean = empService.authenticate(id, pwd);

		if (bean != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("emp", bean);
			return "homepage";
		} else {
			map.addAttribute("errMsg", "Invalid Credentials");
			return "Login";
		}
	}

	@GetMapping("/searchForm")
	public String getSearch(ModelMap map, HttpSession session) {

		if (session.getAttribute("emp") != null) {
			return "Search";
		} else {
			map.addAttribute("errMsg", "please login first");
			return "Login";
		}
		
	}

	@GetMapping("/search")
	public String searchEmp(int id, ModelMap map, @SessionAttribute(name = "emp", required = false) EmployeeBean bean) {

		if (bean != null) {
			EmployeeBean bean2 = empService.getEmployee(id);
			if (bean2 != null) {
				map.addAttribute("data", bean2);
			} else {
				map.addAttribute("msg", "data not found for id : " + id);
			}
			return "Search";
		} else {
			map.addAttribute("errMsg", "please login first");
			return "Login";
		}

	}

	@GetMapping("/logout")
	public String logOut(@SessionAttribute(name = "emp", required = false) EmployeeBean bean, ModelMap map,
			HttpSession session) {

		if (bean != null) {
			if (session != null) {
				session.invalidate();
				map.addAttribute("msg", "LogOut Successful");
			} else {
				map.addAttribute("errMsg", "LogOut not Successful");
			}
		} else {
			map.addAttribute("errMsg", "please login first");
		}
		return "Login";
	}

	@GetMapping("/showDelete")
	public String showDelete(@SessionAttribute(name = "emp", required = false) EmployeeBean bean, ModelMap map) {
		if (bean != null) {
			return "Delete";
		} else {
			map.addAttribute("errMsg", "please login first");
			return "Login";
		}
	}

	@GetMapping("/delete")
	public String deleteEmployee(Integer id, @SessionAttribute(name = "emp", required = false) EmployeeBean bean,
			ModelMap map) {

		if (bean != null) {
			boolean b = empService.deleteEmployee(id);
			if (b) {
				map.addAttribute("msg", id + " Deleted Successfully");

			} else {
				map.addAttribute("errMsg", "Id " + id + " not found");
			}
		} else {
			map.addAttribute("errMsg", "please login first");
			return "Login";
		}

		return "Delete";
	}
	
	@GetMapping("/ShowAllEmployees")
	public String seeAllEmployees(@SessionAttribute(name = "emp", required = false) EmployeeBean bean,
			ModelMap map) {
		
		if (bean != null) {
			List<EmployeeBean> list = empService.getAllEmployees();
			map.addAttribute("data",list);
			return "ShowAllData";
		} else {
			map.addAttribute("errMsg", "please login first");
			return "Login";
		}
	}

}
