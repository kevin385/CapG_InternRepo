package lab5;

class minAgeException extends RuntimeException {
	public minAgeException(String msg) {
		super(msg);
	}
}

class Person {
	void ageCheck(int age) {
		if(age > 15) {
			System.out.println("Age Accepted");
		}
		else {
			throw new minAgeException("Age not accepted");
		}
	}
}

public class Exercise1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.ageCheck(15);

	}

}
