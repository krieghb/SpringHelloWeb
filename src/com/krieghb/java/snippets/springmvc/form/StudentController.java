package com.krieghb.java.snippets.springmvc.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


@Controller
public class StudentController {

	@RequestMapping(value = "/studentIndex", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		
		return "studentResult";
	}
	   
	@RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
	public String goIndex(ModelMap model) {
	   model.addAttribute("message", "Hello Spring MVC Framework!");
	
	   return "studentIndex";
	}

}
