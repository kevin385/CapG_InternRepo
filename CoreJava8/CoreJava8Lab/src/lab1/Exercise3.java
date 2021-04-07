package lab1;
import java.util.*;

public class Exercise3 {
	void recursiveFib(int num1, int num2, int count) {
		if(count == 0) {
			return;
		}
		System.out.print(", " + (num1+num2));
		recursiveFib(num2, num1+num2, --count);
	}
	
	void nonRecursiveFib(int count) {
		int num1=1, num2=1, temp, i=2;
		System.out.print(num1+", "+num2);
		while(i<count)
		{
			temp = num1+num2;
			num1 = num2;
			num2 = temp;
			System.out.print(", "+temp);
			i+=1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise3 exercise3 = new Exercise3();
		int count;
		System.out.println("Enter number of values to be displayed: ");
		count = sc.nextInt();
		System.out.println("Non-Recursive Fibonacci Series: ");
		exercise3.nonRecursiveFib(count);
		System.out.println();
		System.out.println("Recursive Fibonacci Series: ");
		System.out.print("1, 1");
		exercise3.recursiveFib(1,1,count-2);
		sc.close();
	}

}
