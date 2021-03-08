package day5.exception;



public class ExceptionDemo1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println("Bangalore");
		System.out.println("50 kms crossed");
		System.out.println("100 kms crossed");
		try {
			System.out.println(2/0);
			a[6] = 20;
		}
		catch(ArithmeticException ex) {
			System.out.println("Do not divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index is btw 0 to 4");
		}
		System.out.println("150 kms crossed");
		System.out.println("200 kms crossed");
		System.out.println("Chennai");
	}

}
