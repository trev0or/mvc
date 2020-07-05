package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {
	
	@RequestMapping("/click")
	public String test() {
		
		return "view";
		
	}
	@RequestMapping("/login")
	public ModelAndView validate(@RequestParam("name")String name,@RequestParam("pass")String  passs) {
		ModelAndView m= new ModelAndView();
		String res = "Welcome"+ name;
		m.setViewName("view");
		
		System.out.println(name);
		m.addObject("result", res);
		return m;
		
	}
	

}
