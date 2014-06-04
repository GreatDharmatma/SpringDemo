package org.rapideagle.tutorials.springdemo.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class ListController {
 
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getdata() {
 
		List<String> list = getList();
 
		//return back to index.jsp
		ModelAndView model = new ModelAndView("list");
		model.addObject("lists", list);
 
		return model;
 
	}
 
	private List<String> getList() {
 
		List<String> list = new ArrayList<String>();
		list.add("List A");
		list.add("List B");
		list.add("List C");
		list.add("List D");
		list.add("List 1");
		list.add("List 2");
		list.add("List 3");
 
		return list;
 
	}
 
}