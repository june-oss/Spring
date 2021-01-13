package org.zerock.controller;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.ToDoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
		log.info("basic.....................>");
	}
	
	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		log.info("basic get.................");
	}
	
	// 오직 get방식만 지원한다.
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get............");
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		log.info("" + dto);
		
		return "ex01";
	}
	
	//파라미터의 수집과 변환
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		
		log.info("name: "+ name);
		log.info("age: " + age);
		
		return "ex02";
	}
	
	//리스트처리
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids")ArrayList<String> ids) {
		
		log.info("ids: " + ids);
		
		return "ex02List";
	}
	
	//배열처리
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		
		log.info("array ids: " + Arrays.toString(ids));
		
		return "ex02Array";
	}
	
	//객체리스트
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		
		log.info("list dtos : " + list);
		
		return "ex02Bean";
	}
	
	//특별하게 파라미터를 변환해서 처리해야하는경우 사용
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
//	}
	
	//날짜를 적용 변환하는경우 객체에서 @DateTimeFormat을 이용하여 간단하게 사용할수있다.
	@GetMapping("/ex03")
	public String ex03(ToDoDTO todo) {
		log.info("todo: " + todo);
		return "ex03";
	}
	
	// @ModelAttribute는 강제로 전달받은 파라미터를 Model에 담아서 전달한다.
	// 기본자료형의 경우는 파라미터로 선언하더라도 기본적으로 화면까지 전달되지는 않는다.
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		
		log.info("dto : " + dto);
		log.info("page : " + page);
		
		return "/sample/ex04";
	}
	//http://localhost:8181/sample/ex04?name=aaaa&age=11&page=9
	
	//
	@GetMapping("/ex05")
	public void ex05() {
		log.info("/ex05...............");
	}
	//http://localhost:8181/sample/ex05
	// servlet-contest.xml의 설정과 같이 맞물러 URL경로를 View로 처리하기 때문에 오류발생
	
	//반환타입이 객체타입인 경우 주로 JSON데이터를 만들어내는 용도로 사용
	//pom에서 Jackson-databind추가해줘야한다.
	// Response Header에 Content-Type이 jason으로 된다.
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		log.info("/ex06.........................");
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("홍길동");
		
		return dto;
	}
	
	//Http 프로토콜의 헤더를 다룰경우 직접다루지않고 ResponseEntity를 통해 원하는 헤더 정보나 데이를 전달할수있다.
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07(){
		log.info("/ex07.............");
		
		//{"name": "홍길동"}
		String msg = "{\"name\" : \"홍길동\"}";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(msg, header, HttpStatus.OK);
	}
	
	//파일 업로드 처리
	@GetMapping("/exUpload")
	public void exUpload() {
		log.info("/exUpload........................");
	}
	
	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {
		
		files.forEach(file->{
			log.info("-----------------------------");
			log.info("name:" + file.getOriginalFilename());
			log.info("size:" + file.getSize());
			
		});
	}
	
}
