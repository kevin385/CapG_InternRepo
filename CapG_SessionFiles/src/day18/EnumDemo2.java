package day18;

public class EnumDemo2 {
	
	enum Sizes {
		s(39),m(40),l(41),xl(42);
		int size;

		private Sizes(int size) {
			this.size = size;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}
	}
	
	public static void main(String[] args) {
		Sizes s = Sizes.l;
		System.out.println("Size: "+s);
		switch(s) {
		case s:
			System.out.println("small size: "+s.getSize());
			break;
		case m:
			System.out.println("medium size: "+s.getSize());
			break;
		case l:
			System.out.println("large size: "+s.getSize());
			break;
		case xl:
			System.out.println("Extra large size: "+s.getSize());
			break;
		default:
			System.out.println("Invalid size");
			break;
		}
	}

}
