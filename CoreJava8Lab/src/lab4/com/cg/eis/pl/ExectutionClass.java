package lab4.com.cg.eis.pl;
import lab4.com.cg.eis.bean.*;
import lab4.com.cg.eis.service.*;


public class ExectutionClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		EmployeeInsuranceSystem eis1 = new EmployeeInsuranceSystem(emp1);
		eis1.getUserDetails();
		eis1.displayUserDetails();
	}

}
