package lab4.com.cg.eis.service;
import lab4.com.cg.eis.bean.Employee;
import java.util.*;

interface EmployeeService {
	public void getUserDetails();
	public String calcInsuranceScheme();
	public void displayUserDetails();
}

public class EmployeeInsuranceSystem implements EmployeeService{
	Employee emp1;
	Scanner sc = new Scanner(System.in);
	public EmployeeInsuranceSystem(Employee emp1) {
		super();
		this.emp1 = emp1;
	}
	public void getUserDetails() {
		System.out.println("User Details Input");
		System.out.println("Enter Name:");
		emp1.setName(sc.next());
		System.out.println("Enter Salary:");
		emp1.setSalary(sc.nextDouble());
		System.out.println("Enter Designation:");
		emp1.setDesignation(sc.next());
		emp1.setInsuranceScheme(calcInsuranceScheme());
	}
	public String calcInsuranceScheme() {
		if (emp1.getSalary() <= 50000.0 && emp1.getSalary() > 30000.0 && emp1.getDesignation() == "Manager") {
			return "Insurance Scheme A";
		}
		else if (emp1.getSalary() <= 30000.0 && emp1.getSalary() > 10000.0 && emp1.getDesignation() == "Developer") {
			return "Insurance Scheme B";
		}
		else
			return "Insurance Scheme C";
	}
	public void displayUserDetails() {
		System.out.println(emp1);
	}
}