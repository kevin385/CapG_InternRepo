package lab3;
import java.util.*;

public class Exercise4 {

	public static int modifyNumber(int number1) {
		String numberStr = Integer.toString(number1);
		StringBuffer numberBuf = new StringBuffer();
		for(int i=0; i<numberStr.length()-1; i++) {
			int num1 = Character.getNumericValue(numberStr.charAt(i));
			int num2 = Character.getNumericValue(numberStr.charAt(i+1));
			numberBuf.append(Math.abs(num1-num2));
		}
		numberBuf.append(numberStr.charAt(numberStr.length()-1));
		return Integer.parseInt(numberBuf.toString());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number1 = sc.nextInt();
		System.out.println(modifyNumber(number1));
		sc.close();
	}

}
