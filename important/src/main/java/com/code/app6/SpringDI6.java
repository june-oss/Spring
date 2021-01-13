package com.code.app6;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI6 {
	public static void main(String[] args) {
//		Q6. @Autowired대신에 context6.xml에 <property>를 이용해서 객체 주입하시오.
//			(단, @Autowired를 사용하지 않고 하시오.)
//		1.AC생성
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context6.xml");
		
		
//		2.AC에서 빈을 가져온다.
		SportsCar c1 = (SportsCar)ac.getBean("car");
		
		System.out.println(c1);


	}
}

class Engine{}
class Door{}

class SportsCar{
	int oil;
	String color;
//	@Autowired
	Engine engine;
//	@Autowired
	Door[] doors;
	
	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Door[] getDoors() {
		return doors;
	}

	public void setDoors(Door[] doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "SportsCar [oil=" + oil + ", color=" + color + ", engine=" + engine + ", doors=" + Arrays.toString(doors)
				+ "]";
	}
}
