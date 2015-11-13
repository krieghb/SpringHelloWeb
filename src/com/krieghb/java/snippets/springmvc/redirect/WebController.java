package com.krieghb.java.snippets.springmvc.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	
	@RequestMapping(value = "/redirectIndex", method = RequestMethod.GET)
	public String index() {
		return "redirectIndex";
	}
	
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:finalPage";
	}
	
	@RequestMapping(value = "finalPage", method = RequestMethod.GET)
	public String finalPage() {
		return "redirectFinal";
	}
	   
	@RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
	public String goIndex(ModelMap model) {
	   model.addAttribute("message", "Hello Spring MVC Framework!");
	
	   return "redirectIndex";
	}

}
