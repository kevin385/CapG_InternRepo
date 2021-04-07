package lab9;

@FunctionalInterface
interface Test1{
	int calculate(int num);
}

class FactC {
	int factorial(int num) {
		int fact=1;
		for (int i=num; i>1; i--) {
			fact *=i;
		}
		return fact;
	}
}

public class Exercise5 {

	public static void main(String[] args) {
		FactC obj = new FactC();
		Test1 t1 = obj::factorial;
		System.out.println(t1.calculate(9));

	}

}
