package com.krieghb.java.snippets.springmvc.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {
	
	@RequestMapping(value = "/errorIndex", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent( @ModelAttribute("SpringWeb")Student student, ModelMap model) {
		
		if (student.getName().length() < 5) {
			throw new SpringException ("Student's name is too short.");
		}
		else {
			model.addAttribute("name", student.getName());
		}
		
		if (student.getAge() < 10) {
			throw new SpringException("Student must be older than 9");	
		}
		else {
			model.addAttribute("age", student.getAge());
		}
		
		model.addAttribute("id", student.getId());
		
		System.out.println("OY!");
		System.out.println("SOY!");
		
		
		
		return "errorResult";
		
	}
	   
	@RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
	public ModelAndView goIndex(ModelMap model) {
		return new ModelAndView("student", "command", new Student());
	}

}
