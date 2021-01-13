package com.code.app4;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI4 {
	public static void main(String[] args) {
//		Q4.Engine, Door를 bean으로 등록하고 SportsCar객체에 주입하는 코드를 작성하시오.
//			(context.xml에서 context라는 namespace를 추가해야한다.)
//		1.ac생성
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context4.xml");
		
//		2.ac에서 빈을 가져온다
		SportsCar c1 = (SportsCar)ac.getBean("car");
		SportsCar c2 = (SportsCar)ac.getBean("car");
		SportsCar c3 = (SportsCar)ac.getBean("car");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
//SportsCar [oil=0, color=null, engine=com.code.app4.Engine@479d31f3, doors=[com.code.app4.Door@40ef3420]]
//SportsCar [oil=0, color=null, engine=com.code.app4.Engine@479d31f3, doors=[com.code.app4.Door@40ef3420]]
//SportsCar [oil=0, color=null, engine=com.code.app4.Engine@479d31f3, doors=[com.code.app4.Door@40ef3420]]


	}
}

class Engine{}
class Door{}

class SportsCar{
	int oil;
	String color;
	@Autowired Engine engine;
	@Autowired Door[] doors;
	
	@Override
	public String toString() {
		return "SportsCar [oil=" + oil + ", color=" + color + ", engine=" + engine + ", doors=" + Arrays.toString(doors)
				+ "]";
	}
}
