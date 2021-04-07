package lab5;

class EmployeeException extends RuntimeException {
	public EmployeeException(String msg) {
		super(msg);
	}
}

class Employee1 {
	void salaryCheck(double salary) {
		if(salary >= 3000) {
			System.out.println("Salary: "+salary);
		}
		else {
			throw new EmployeeException("Salary Low");
		}
	}
}

public class Exercise3 {

	public static void main(String[] args) {
		try {
			Employee1 emp = new Employee1();
			emp.salaryCheck(2300);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
