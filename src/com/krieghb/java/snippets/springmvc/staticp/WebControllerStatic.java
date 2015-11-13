package com.krieghb.java.snippets.springmvc.staticp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebControllerStatic {
	
	@RequestMapping(value = "/staticIndex", method = RequestMethod.GET)
	public String index() {
		return "staticIndex";
	}
	
	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/pages/staticFinal.htm";
	}
	   
   @RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
   public String goIndex(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");

      return "staticIndex";
   }
	

	
	
}
