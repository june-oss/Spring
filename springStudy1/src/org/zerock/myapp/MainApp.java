package org.zerock.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Board board = Factory.getBoardInstance();
		//board.boardWrite();
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context4.xml");
		
		Board board = ac.getBean("board", Board.class);
		
		board.boardWrite();
	}

}
