package com.code.app5;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringDI5 {
	public static void main(String[] args) {
//		Q5. Engine, Door를 bean으로 등록하고 sportscar객체에 주입하는 코드를 작성하시오.
//			(단, autowired를 사용하지 않고 하시오.)
//		1.ac생성
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:context5.xml"); 
//		2.ac에서 빈을 가져온다.
		SportsCar c1 = (SportsCar)ac.getBean("car");
		c1.setEngine((Engine)ac.getBean("engine"));

		
		c1.setDoors(new Door[] {
				ac.getBean("door", Door.class),
				ac.getBean("door", Door.class),
				ac.getBean("door", Door.class),
				ac.getBean("door", Door.class)
		});
		
		System.out.println(c1);
//		SportsCar [oil=0, color=null, engine=com.code.app5.Engine@5fbe4146, 
//					doors=[com.code.app5.Door@1e66f1f5, com.code.app5.Door@4e50c791,
//							com.code.app5.Door@7530ad9c, com.code.app5.Door@58a9760d]]

	}
}

class Engine{}
class Door{}

class SportsCar{
	int oil;
	String color;
	Engine engine;
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
