package day10;

abstract class Planet {
	protected void revolve() {
		
	}
	abstract void rotate();
}

class Earth extends Planet {
	protected void revolve() {
		
	}
	protected void rotate() {
		
	}
}

public class Test {
	
	public static void main(String[] args) {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		//total += letters.substring(1,2).length();
		total += letters.substring(6,6).length();
		//total += letters.substring(6,5).length();
		System.out.println(total);
	}
}
