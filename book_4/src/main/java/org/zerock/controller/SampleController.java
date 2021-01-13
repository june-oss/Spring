package org.zerock.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;
import ort.zerock.domain.SampleDTO;
import ort.zerock.domain.SampleDTOList;
import ort.zerock.domain.TodoDTO;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {	

	@RequestMapping("")
	public void basic() {
		
		log.info("basic........");
	}
	
	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basisGet() {
		
		log.info("basic get only get.............");
		
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		
		log.info("basic get only get.............");
		
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		log.info("" + dto);
		
		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		
		log.info("name:" + name);
		log.info("age:" + age);
		
		return "ex02";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<SampleDTO> ids ) {
		
		log.info("ids: " + ids);
		
		return "ex02List";
	}
	
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		
		log.info("Array ids: " + ids);
		
		return "ex02Array";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		
		log.info("list dtos: " + list);
		
		return "ex02Bean";
	}
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class , new CustomDateEditor(dateFormat, false));
//	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		
		log.info("todo: " +todo);
		return "ex03";
	}

	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, int page) {
		
		log.info("dto:"+dto);
		log.info("page:"+page);
		
		return "/sample/ex04";
	}
	
	
	
	
}
