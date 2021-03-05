package day3.oops;

class Shopping {
	void search() {
		System.out.println("This is default search");
	}
	void search(int modelNumber) {
		System.out.println("You're searching with model no: "+modelNumber);
	}
	void search(int modelNumber, String brandname) {
		System.out.print("You're searching with model no: "+modelNumber);
		System.out.println(" & brand name: "+brandname);
	}
	void search(String brandname, int modelNumber) {
		System.out.print("You're searching with brand name: "+brandname);
		System.out.println(" & model no: "+modelNumber);
	}
	void search(String brandname) {
		System.out.println("You're searching with brand name: "+brandname);
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		shopping.search(2012,"Samsung");
		shopping.search(2012);
		shopping.search("Samsung");
		shopping.search("Samsung",2012);
	}

}
