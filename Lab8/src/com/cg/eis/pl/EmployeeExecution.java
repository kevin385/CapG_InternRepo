package com.cg.eis.pl;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.*;

public class EmployeeExecution {
	//private static Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	
	public static void employeeDisplay(Scanner sc, Map<Integer, Employee> empMap) {
		IEmployeeService es = new EmployeeServiceImpl();
		System.out.println("\n1. Display all employee details\n2. Display employee details by ID\n3. Display employee details by Insurance Scheme\nEnter Your Choice:");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			es.displayEmployeeDetails(empMap);;
			break;
		case 2:
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			es.displayEmployeeDetailsById(empMap,id);
			break;
		case 3:
			es.displayEmployeeDetailsBasedOnInsuranceScheme(empMap);
			break;
		default:
			System.out.println("Invalid Choice");
			break;		
		}
	}
	
	public static void main(String[] args) {
		boolean control = true;
		Scanner sc = new Scanner(System.in);
		IEmployeeService es = new EmployeeServiceImpl();
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		int ch;
		while(control) {
			System.out.println("1. Enter Employee Details\n2. Display Employee Details\n3. Delete an Employee Record\n4. Exit\nEnter Your Choice:");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				es.getEmployeeDetails(empMap);
				break;
			case 2:
				employeeDisplay(sc, empMap);
				break;
			case 3:
				System.out.println("Enter ID:");
				int id = sc.nextInt();
				es.deleteEmployeeRecordById(empMap, id);
				break;
			case 4:
				control = false;
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
		}
		sc.close();
	}

}
