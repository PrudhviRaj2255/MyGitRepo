package com.te.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvc.beans.UserBean;

@Controller
public class SpringMvcController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("/WEB-INF/views/homepage.jsp");
		return view;
	}

//	@RequestMapping(path = "/search", method = RequestMethod.GET)
//	public ModelAndView getData(ModelAndView view, HttpServletRequest request) {
//		String name = request.getParameter("name");
//		view.addObject("username", name);
//		view.setViewName("newhome");
//		return view;
//	}

	@GetMapping("/login")
	public String getForm() {
		return "loginForm";
	}

	@PostMapping("/login")
	public String getUser(HttpServletRequest request, ModelMap map) {
		String name = request.getParameter("user");
		int password = Integer.parseInt(request.getParameter("pwd"));

		map.addAttribute("user", name);
		map.addAttribute("pwd", password);

		return "userDetails";
	}

	@PostMapping("/login1")
	public String name(ModelMap map, String user, int pwd) {
		map.addAttribute("user", user);
		map.addAttribute("pwd", pwd);

		return "userDetails";
	}

	@PostMapping("/login2")
	public String name(UserBean bean, ModelMap map) {
		map.addAttribute("user", bean.getUser());
		map.addAttribute("pwd", bean.getPwd());
		
		return "userDetails";
	}

	@PostMapping("/login3")
	public String name1(ModelMap map, @RequestParam(name = "") String user, @RequestParam(name = "pwd") int password ) {
		map.addAttribute("user", user);
		map.addAttribute("pwd", password);
		
		return "userDetails";
	}

	
}
