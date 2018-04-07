package org.tig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController { 
	
	private String viewBasePath = "/manage";
	
	@GetMapping("/") 
	public String index(ModelMap model){
		
		return viewBasePath + "/home";	
	}

}
