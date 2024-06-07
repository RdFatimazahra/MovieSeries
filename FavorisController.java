package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class FavorisController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String favoris() {
		return"favoris";
	}
	@RequestMapping(value = "/favoris", method = RequestMethod.POST)
	public String getFavorisInfo(@RequestParam (name = "name") String name, ModelMap model) {
		model.put("name", name);
		System.out.println(name);
		return"home";
	}
	  @RequestMapping(value = "/home")
	    public String hom(){
	        return "home";
	    }
}
