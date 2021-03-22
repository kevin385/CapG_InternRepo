package streamApiCaseStudy;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeService {
    public double getSumOfSalary(List<Employee> elist) {
    	return elist.stream().mapToDouble(s->s.getSalary()).sum();
    }
    
    public void departmentNameAndEmployeeCount(List<Employee> elist, List<Department> dlist) {
    	dlist.stream().map(d->d.getDepartmentName()).forEach(s->System.out.println(s));
    	List<Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getDep())).collect(Collectors.toList());
    	for (Department dept:dlist) {
    		long count = tempElist.stream().filter(d->dept.getDepartmentId() == d.getDep().getDepartmentId()).count();
    		System.out.println(dept.getDepartmentName()+": "+count);
    	}
    }
    
	public void seniorMostEmployee(List<Employee> elist) {
    	LocalDate minDate = elist.stream().map(e->e.getLocalDate()).min(Comparator.comparing(LocalDate::toEpochDay)).get();
    	elist.stream().filter(e->e.getLocalDate().equals(minDate)).forEach(s->System.out.println(s));
    }
	
	public void nameAndDurationOfService(List<Employee> elist) {
		Function<LocalDate, String> dateDisplay = (joiningDate) -> {
			Period p = Period.between(joiningDate, LocalDate.now()); 
			return "Years: "+p.getYears()+", Months: "+p.getMonths()+", Days: "+p.getDays();
		};
		elist.stream().map(e->"Name: "+e.getFirstName()+" "+e.getLastName()+", "+dateDisplay.apply(e.getLocalDate())).forEach(s->System.out.println(s));
	}
	
	public void employeesWithoutDepartments(List<Employee> elist) {
		elist.stream().filter(d->Objects.isNull(d.getDep())).forEach(s->System.out.println(s));
	}
	
	public void departmentsWithoutEmployees(List<Employee> elist, List<Department> dlist) {
    	List<Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getDep())).collect(Collectors.toList());
    	for (Department dept:dlist) {
    		long count = tempElist.stream().filter(d->dept.getDepartmentId() == d.getDep().getDepartmentId()).count();
    		if (count == 0) {
    			System.out.println(dept.getDepartmentName());
    		}
    	}
	}
	
	public void departmentWithHighestCount(List<Employee> elist, List<Department> dlist) {
		List <Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getDep())).collect(Collectors.toList());
		tempElist.stream().map(e->e.getFirstName());
		Map<String, Long> departmentCount = new HashMap<String, Long>();
		for (Department dept:dlist) {
    		long count = tempElist.stream().filter(d->dept.getDepartmentId() == d.getDep().getDepartmentId()).count();
    		departmentCount.put(dept.getDepartmentName(), count);
    	}
		System.out.println(departmentCount.entrySet().stream().max((dept1, dept2) -> dept1.getValue() > dept2.getValue() ? 1 : -1).get().getKey());
	}
	
	public void employeeNameHireDate(List<Employee> elist) {
		elist.stream().map(e->"Name: "+e.getFirstName()+" "+e.getLastName()+", Date: "+e.getLocalDate()+", Day of the Week: "+e.getLocalDate().getDayOfWeek()).forEach(s->System.out.println(s));
	}
	
	public void employeeNameHireDateFriday(List<Employee> elist) {
		elist.stream().filter(e->e.getLocalDate().getDayOfWeek().toString().equalsIgnoreCase("Friday")).map(e->"Name: "+e.getFirstName()+" "+e.getLastName()+", Date: "+e.getLocalDate()+", Day of the Week: "+e.getLocalDate().getDayOfWeek()).forEach(s->System.out.println(s));
	}
	
	public void employeeReportsTo(List<Employee> elist) {
		Function<Integer, String> getManagerName = (managerId) -> {
			for (Employee e: elist) {
				if(e.getEmployeeId() == managerId) {
					return e.getFirstName()+" "+e.getLastName();
				}
			}
			return "no one";
		};
		elist.stream().map(e->e.getFirstName()+" "+e.getLastName()+" reports to "+getManagerName.apply(e.getManagerId())).forEach(s->System.out.println(s));
	}
	
	public void employeeNameSalary10(List<Employee> elist) {
		elist.stream().map(e->e.getFirstName()+" "+e.getLastName()+" "+e.getSalary()+" "+String.format("%.2f", e.getSalary()*1.1)).forEach(s->System.out.println(s));
	}
	
	public void employeeWhoDontReport(List<Employee> elist) {
		elist.stream().filter(e->e.getManagerId() == null).forEach(s->System.out.println(s));
	}
    
	public void findSubOrdinates(List<Employee> elist) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name & Last Name of Manager:");
		String firstName = sc.next();
		String lastName = sc.next();
		//elist.stream()
		sc.close();
	}
	
    public static void main(String args[]) {
    	EmployeeService ex = new EmployeeService();
    	List<Employee> elist = EmployeeRepository.getEmployees();
    	List<Department> dlist = EmployeeRepository.getDepartments();
    	System.out.println(ex.getSumOfSalary(elist));
    	System.out.println("===========================");
    	ex.departmentNameAndEmployeeCount(elist, dlist);
    	System.out.println("===========================");
    	ex.seniorMostEmployee(elist);
    	System.out.println("===========================");
    	ex.nameAndDurationOfService(elist);
    	System.out.println("===========================");
    	ex.employeesWithoutDepartments(elist);
    	System.out.println("===========================");
    	ex.departmentsWithoutEmployees(elist, dlist);
    	System.out.println("===========================");
    	ex.departmentWithHighestCount(elist, dlist);
    	System.out.println("===========================");
    	ex.employeeNameHireDate(elist);
    	System.out.println("===========================");
    	ex.employeeNameHireDateFriday(elist);
    	System.out.println("===========================");
    	ex.employeeReportsTo(elist);
    	System.out.println("===========================");
    	ex.employeeNameSalary10(elist);
    	System.out.println("===========================");
    	ex.employeeWhoDontReport(elist);
    	System.out.println("===========================");
    }
}