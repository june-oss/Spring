package com.code.app2;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI2 {
	public static void main(String[] args) {
//		Q2.ApplicationContext를 이용해서 객체를 얻어오도록 변경하시오.
//		SportsCar car = new SportsCar();
//		HashMap map = new HashMap();
//		map.put("car", car);
//		1.ac생성
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context2.xml"); 
//		2.ac에서 빈을 가져온다.
		SportsCar c = (SportsCar)ac.getBean("car");
		SportsCar c2 = (SportsCar)ac.getBean("car");
		SportsCar c3 = (SportsCar)ac.getBean("car");
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
//		com.code.app2.SportsCar@747ddf94
//		com.code.app2.SportsCar@747ddf94
//		com.code.app2.SportsCar@747ddf94

	}
}

class Engine{}
class Door{}

class SportsCar{
	int oil;
	String color;
	Engine engine;
	Door[] doors;
}
