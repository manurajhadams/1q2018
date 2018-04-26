package com.q12018.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.q12018.demo.database.DatabaseUtilities;

@Controller
public class DeploymentController {
	
	@Autowired
	DatabaseUtilities dbUtils;
	
	@RequestMapping(value = "/")
    public ModelAndView deploy() {
		System.out.println("====================Got the Call=====================");
		ModelAndView mav = new ModelAndView();
		mav.addObject("events", dbUtils.getEventProfile());
		mav.setViewName("event");
		return mav;
		//return "event";
	}
}