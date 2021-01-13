package com.code.app7;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI7 {
	public static void main(String[] args) {
//		Q7.oil, engine, door 3개의 매개변수를 받는 생성자를 추가하고 context.xml에
//			<constructor-arg>를 이용해서 객체를 주입하도록 작성하시오.
//		1.AC생성
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context7.xml");
		
		
//		2.AC에서 빈을 가져온다.
		SportsCar c = (SportsCar)ac.getBean("car");
		
		System.out.println(c);


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
	
	
	public SportsCar() {
	super();
}

	public SportsCar(int oil, Engine engine, Door[] doors) {
	super();
	this.oil = oil;
	this.engine = engine;
	this.doors = doors;
}

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
