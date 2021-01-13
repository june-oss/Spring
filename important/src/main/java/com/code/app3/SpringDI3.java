package com.code.app3;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI3 {
	public static void main(String[] args) {
//		Q3.getBean으로 객체를 얻어올때마다 새로운 객체를 받아오게 코드를 작성하시오.
//		1.ac생성
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context3.xml"); 
//		2.ac에서 빈을 가져온다. 기본적으로scope가 singletone이라서
//		scope를 prototype으로 잡으면 꺼내올때마다 새로운 객체생성
		SportsCar c1 = (SportsCar)ac.getBean("car");
		SportsCar c2 = (SportsCar)ac.getBean("car");
		SportsCar c3 = (SportsCar)ac.getBean("car");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
//com.code.app3.SportsCar@19d37183
//com.code.app3.SportsCar@1a0dcaa
//com.code.app3.SportsCar@3bd40a57

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
