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
    	List<Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getDep())).collect(Collectors.toList());	//Returns List without null values of that field
    	for (Department dept:dlist) {
    		long count = tempElist.stream().filter(d->dept.getDepartmentId() == d.getDep().getDepartmentId()).count();
    		System.out.println(dept.getDepartmentName()+": "+count);
    	}
    }
    
	public void seniorMostEmployee(List<Employee> elist) {
    	LocalDate minDate = elist.stream().map(e->e.getLocalDate()).min(Comparator.comparing(LocalDate::toEpochDay)).get();		// https://beginnersbook.com/2019/02/java-8-stream-min-and-max/
    	elist.stream().filter(e->e.getLocalDate().equals(minDate)).forEach(s->System.out.println(s));							//We first retrieve the oldest join date and retrieve the employee details who joined at that date
    }
	
	public void nameAndDurationOfService(List<Employee> elist) {
		Function<LocalDate, String> dateDisplay = (joiningDate) -> {	//This function retrieves the joining date as LocalDate format, finds the duration with todays date 
			Period p = Period.between(joiningDate, LocalDate.now()); 	//and retrieves interval of months days and years between the two and returns as String
			return "Years: "+p.getYears()+", Months: "+p.getMonths()+", Days: "+p.getDays();
		};
		elist.stream().map(e->"Name: "+e.getFirstName()+" "+e.getLastName()+", "+dateDisplay.apply(e.getLocalDate())).forEach(s->System.out.println(s));
	}
	
	public void employeesWithoutDepartments(List<Employee> elist) {
		elist.stream().filter(d->Objects.isNull(d.getDep())).forEach(s->System.out.println(s));
	}
	
	public void departmentsWithoutEmployees(List<Employee> elist, List<Department> dlist) {
    	List<Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getDep())).collect(Collectors.toList());	//Returns List without null values of that field
    	for (Department dept:dlist) {
    		long count = tempElist.stream().filter(d->dept.getDepartmentId() == d.getDep().getDepartmentId()).count();
    		if (count == 0) {
    			System.out.println(dept.getDepartmentName());
    		}
    	}
	}
	
	public void departmentWithHighestCount(List<Employee> elist, List<Department> dlist) {
		List <Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getDep())).collect(Collectors.toList());	//Returns List without null values of that field
		tempElist.stream().map(e->e.getFirstName());		
		Map<String, Long> departmentCount = new HashMap<String, Long>();	//HashMap of dept name and count of employees
		for (Department dept:dlist) {										
    		long count = tempElist.stream().filter(d->dept.getDepartmentId() == d.getDep().getDepartmentId()).count();
    		departmentCount.put(dept.getDepartmentName(), count);
    	}
		System.out.println(departmentCount.entrySet().stream().max((dept1, dept2) -> dept1.getValue() > dept2.getValue() ? 1 : -1).get().getKey());		// https://stackoverflow.com/questions/5911174/finding-key-associated-with-max-value-in-a-java-map
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
		int managerId = 0;
		for(Employee e: elist) {
			if (e.getFirstName().equalsIgnoreCase(firstName) && e.getLastName().equalsIgnoreCase(lastName)) {
				managerId = e.getEmployeeId();
				break;
			}
		}
		List <Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getManagerId())).collect(Collectors.toList());	//Returns List without null values of that field
		Integer mid = new Integer(managerId);
		tempElist.stream().filter(e-> e.getManagerId() == mid.intValue()).forEach(s->System.out.println(s));

		sc.close();
	}
	
	public void sortEmployeeById(List<Employee> elist) {
		elist.stream().sorted(Comparator.comparing(Employee::getEmployeeId)).forEach(s->System.out.println(s));
	}
	
	public void sortEmployeeByDeptId(List<Employee> elist) {
		List<Employee> tempElist = elist.stream().filter(e->!Objects.isNull(e.getDep())).collect(Collectors.toList());		//Returns List without null values of that field
		tempElist.stream().sorted(Comparator.comparing(e->e.getDep().getDepartmentId())).forEach(s->System.out.println(s));
	}

	public void sortEmployeeByFirstName(List<Employee> elist) {
		elist.stream().sorted(Comparator.comparing(Employee::getFirstName)).forEach(s->System.out.println(s));
	}
	
    public static void main(String args[]) {
    	EmployeeService ex = new EmployeeService();
    	List<Employee> elist = EmployeeRepository.getEmployees();
    	List<Department> dlist = EmployeeRepository.getDepartments();
    	System.out.println(ex.getSumOfSalary(elist));
    	System.out.println("==========Dept Name & Employee Count=================");
    	ex.departmentNameAndEmployeeCount(elist, dlist);
    	System.out.println();
    	System.out.println("==========Senior Most Employee=================");
    	ex.seniorMostEmployee(elist);
    	System.out.println();
    	System.out.println("=========Name and Duration of Service=============");
    	ex.nameAndDurationOfService(elist);
    	System.out.println();
    	System.out.println("========Employees without Departments==============");
    	ex.employeesWithoutDepartments(elist);
    	System.out.println();
    	System.out.println("=========Departments Without Employees===========");
    	ex.departmentsWithoutEmployees(elist, dlist);
    	System.out.println();
    	System.out.println("===========Department With Highest Count===========");
    	ex.departmentWithHighestCount(elist, dlist);
    	System.out.println();
    	System.out.println("==========Employee Name & Hire Date===========");
    	ex.employeeNameHireDate(elist);
    	System.out.println();
    	System.out.println("========Employee Name & Hire Date on Friday===========");
    	ex.employeeNameHireDateFriday(elist);
    	System.out.println();
    	System.out.println("=========Employee Reports to===========");
    	ex.employeeReportsTo(elist);
    	System.out.println();
    	System.out.println("=========Employee Name,Salary with 10% Increment==========");
    	ex.employeeNameSalary10(elist);
    	System.out.println();
    	System.out.println("========Employees Who Dont Report========");
    	ex.employeeWhoDontReport(elist);
    	System.out.println();
    	System.out.println("========Display Subordinates under Manager=========");
    	ex.findSubOrdinates(elist);
    	System.out.println();
    	System.out.println("========Sort by empID=========");
    	ex.sortEmployeeById(elist);
    	System.out.println();
    	System.out.println("========Sort by DeptID========");
    	ex.sortEmployeeByDeptId(elist);
    	System.out.println();
    	System.out.println("========Sort by FirstName==========");
    	ex.sortEmployeeByFirstName(elist);
    	System.out.println();
    	System.out.println("===========================");
    }
}