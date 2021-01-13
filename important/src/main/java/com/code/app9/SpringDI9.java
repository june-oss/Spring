package com.code.app9;

import java.util.Arrays;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

public class SpringDI9 {
	public static void main(String[] args) {
//		Q6.@Component를 이용한 자동 컴포넌트 스캔이 되도록 변경
//		1.AC생성
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context9.xml");
		
		
//		2.AC에서 빈을 가져온다.
		SportsCar c = (SportsCar)ac.getBean("car");
		
		System.out.println(c);


	}
}
@Component("engine")
class Engine{}

@Component("turboEngine")
class TurboEngine extends Engine{}

@Component("door")
class Door{}

@Component("car")
class SportsCar{
	int oil;
	String color;
	@Autowired
	@Qualifier("turboEngine")
	Engine engine;
	@Autowired
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
