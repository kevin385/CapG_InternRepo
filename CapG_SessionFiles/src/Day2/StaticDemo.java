package Day2;

public class StaticDemo {
	static {
		System.out.println("In Static block1.");
	}
	public static void main(String[] args) {
		System.out.println("In main.");
	}
	static {
		System.out.println("In Static block2.");
	}
}
