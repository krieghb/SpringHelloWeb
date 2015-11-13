package com.krieghb.java.snippets.springmvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
public class HelloController{
 
   @RequestMapping(value = "/basicIndex", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");

      return "basicIndex";
   }
   
   @RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
   public String goIndex(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");

      return "basicIndex";
   }
   

}