package com.code.app;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
//	@RequestMapping(value = "/home", method = RequestMethod.GET)
//	public void home(@ModelAttribute("id")String id,
//			@ModelAttribute("age")int age,
//			@ModelAttribute("birthDate") @DateTimeFormat(pattern = "yyyy-MM-dd")Date birthDate) {
	
	@GetMapping("/home")
	public void home(@ModelAttribute("user")User u) {
		System.out.println("home() is called");
		System.out.printf("id = %s, age = %d, birthDate=%s%n",u.getId(), u.getAge(), u.getBirthDate());
		
//		m.addAttribute("id", id);
//		m.addAttribute("age", age);
//		m.addAttribute("birthDate", birthDate);
 	}
	
	
}
