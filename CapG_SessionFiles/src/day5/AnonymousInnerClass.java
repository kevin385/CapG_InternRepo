package day5;

class Bank2 {
	void rateOfInterest() {
		System.out.println("5%");
	}
}

//A Class without name
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Bank2 sbi = new Bank2() {	//This is making anonymous
			void rateOfInterest() {
				System.out.println("7%");
			}
		};
		sbi.rateOfInterest();

	}

}
