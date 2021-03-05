package day2;

public class TypeCasting {
	public void castingTest() {
		double d = 200.25d;
		float f = 200.23f; //f should be specified
		int a = (int) d;
		System.out.println("Value of a: " + a);
	}
	public static void main(String[] args) {
		TypeCasting ob = new TypeCasting();
		ob.castingTest();

	}

}
