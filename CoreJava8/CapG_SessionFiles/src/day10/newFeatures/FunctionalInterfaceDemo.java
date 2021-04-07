package day10.newFeatures;


@FunctionalInterface
interface Demo
{
	void add(int a,int b);
}
@FunctionalInterface
interface Demo2
{
	//void add(int a,int b);
	//void sub(int a,int b); not a functional interface
	
	int sub(int a, int b);
}

interface Demo3 {
	String large(int a, int b);
}



public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Demo d = (a,b)->System.out.println(a+b);
		
		d.add(2, 4);
	
		Demo2 d2 = (a,b)-> a-b;
		System.out.println(d2.sub(4, 2));
		
		Demo3 d3 = (a,b) -> {
			if(a>b)
				return "a is greater";
			return "b is greater";
		};
		System.out.println(d3.large(5, 7));
	}

}
