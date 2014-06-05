package org.rapideagle.tutorials.springdemo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.rapideagle.tutorials.springdemo.hibernate.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class DepartmentController {
	
	DepartmentService deptService;
	
	@RequestMapping("/DepartmentList")  
	public ModelAndView getUserList() 
	{
		deptService = new DepartmentService();
		Map<String, Object> model = new HashMap<String, Object>();  
	    model.put("deptList", deptService.getDepartments());  
	    return new ModelAndView("DepartmentList", model);
	}
}