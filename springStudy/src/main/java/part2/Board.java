package part2;

public class Board {
	private FreeBoardWrite write;
	public void setWrite(FreeBoardWrite write) {
		this.write = write;
	}
	
	public Board() {
		this.setWrite(new FreeBoardWrite());//게시판이 바뀔때마다 변경해줘야한다.
	}
	
	public void boardWrite() {
		write.doWrite();
	}
}
//하나의 class를 수정하면 참조하거나 참조되어지는 Class를 모두 찾아 수정해야함.
// class간의 너무 강한 결함으로 연결되어있다.