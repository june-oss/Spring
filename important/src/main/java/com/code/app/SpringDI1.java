package com.code.app;

import java.util.HashMap;

public class SpringDI1 {
	public static void main(String[] args) {
		
		SportsCar car = new SportsCar();
		HashMap map = new HashMap();
		map.put("car", car);
		
		SportsCar c = (SportsCar)map.get("car");
		System.out.println(c);
//		com.code.app.SportsCar@270421f5

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
