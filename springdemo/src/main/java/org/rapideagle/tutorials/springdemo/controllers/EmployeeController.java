package org.rapideagle.tutorials.springdemo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.rapideagle.tutorials.springdemo.hibernate.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class EmployeeController {
	
	EmployeeService empService;
	
	@RequestMapping("/EmployeeList")  
	public ModelAndView getUserList() 
	{
		empService = new EmployeeService();
		Map<String, Object> model = new HashMap<String, Object>();  
	    model.put("empList", empService.getEmployee());  
	    return new ModelAndView("EmployeeList", model);
	}
}