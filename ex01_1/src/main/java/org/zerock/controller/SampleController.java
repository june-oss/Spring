package org.zerock.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(java.util.Date.class , new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping("")
	public void basic() {
		
		log.info("basic..............");
	}
	
	//get/post방식 둘다 사용가능
	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		
		log.info("basic get..............");
	}

	//오직 GET방식만 사용가능
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		
		log.info("basic get only GET..............");
	}
	
	@GetMapping("/ex01")
	public void ex01(SampleDTO dto) {
		
		log.info("" + dto);
		
	}

	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		
		log.info("name : " + name);
		log.info("age : " + age);
		
		return "ex02";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		
		log.info("ids: " + ids);
		
		return "ex02List";
	}
	 
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		
		log.info("Array ids: " + Arrays.toString(ids));
		
		return "ex02Array";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		
		log.info("list dots: " + list);
		
		return "ex02Bean";
	}

	@GetMapping("/ex0")
	public String ex03(TodoDTO todo) {
		
		log.info("todo:" + todo);
		
		return "ex03";
	}
	
	@GetMapping("/ex04")
//	public String ex04(SampleDTO dto, int page) {
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page)	{
		log.info("dto: " + dto);
		log.info("page: " +page);
		
		return "/sample/ex04";
	}
	
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		log.info("/ex06.................");
		SampleDTO dto = new  SampleDTO();
		dto.setAge(10);
		dto.setName("홍길동");
		
		return dto;
	}
}
