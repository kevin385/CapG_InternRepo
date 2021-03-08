package day5.exception;

class LateException extends RuntimeException {
	public LateException (String msg) {
		super(msg);
	}
}

class Employee {
	public void login(int time) {
		if(time<=9) {
			System.out.println("You are present");
		}
		else {
			throw new LateException("You are absent");
		}
	}
}

public class CustomException1 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.login(11);

	}

}
