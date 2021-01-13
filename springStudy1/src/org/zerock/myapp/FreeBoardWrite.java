package org.zerock.myapp;

public class FreeBoardWrite  implements Write{

	private String sBoardName;

	public FreeBoardWrite() {
		super();
		init();
	}
	
	
	public String getsBoardName() {
		return sBoardName;
	}


	public void setsBoardName(String sBoardName) {
		this.sBoardName = sBoardName;
	}


	public void init() {
		this.setsBoardName("Free Board");
	}

	@Override
	public void doWrite() {
		System.out.println(this.getsBoardName() + " Write down !!");
	}


	}
	
