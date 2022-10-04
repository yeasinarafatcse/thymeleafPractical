package com.practice.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/about", method= RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler..");
		
		model.addAttribute("name","Arafat");
		model.addAttribute("currentDate", "Today");
		return "about";
	}
	
	//handling iteration
	
	@GetMapping("/example-loop")
	public String interateHandler(Model m) {
		
		List<String> names = List.of("Yeasin", "Arafat", "Miraz", "Hridoy");
		m.addAttribute("names", names);
		return "interate";
	}
	
	//handler for conditional statement
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		m.addAttribute("isActive", false);
		m.addAttribute("gender", 'M');
		
		List<Integer> list = List.of(233,98,30,234,78,80);
		m.addAttribute("mylist", list);
		
		return "condition";
	}
	
	//handler for including fragment
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		m.addAttribute("title", "This is arafat");
		m.addAttribute("subtitle","This is subtitle");
		return "service";
	}
	
	//for new about
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}
