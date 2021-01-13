package org.zerock.myapp;

public class BoardCafe implements Board{

	private Write write;
	
	public void setWrite(Write write) {
		this.write = write;
	}


	public BoardCafe() {
		this.setWrite(Factory.getWriteInstance());
		
	}
	@Override
	public void boardWrite() {
		// TODO Auto-generated method stub
		write.doWrite();
	}
	
}
