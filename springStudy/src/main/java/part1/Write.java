package part1;

public class Write {
	
		private String sBoardName;
		
		public Write() {
			init();
		}
		
		public void init() {
			this.SetsBoardName("Free Board");
		}
		
		public void SetsBoardName(String sBoardName) {
			this.sBoardName = sBoardName;
		}
		
		public String getsBoardName() {
			return sBoardName;
		}
		
		public void doWrite() {
			System.out.println(this.getsBoardName() + " Write down!!");
		}
		
}
