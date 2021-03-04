package Day2.oops;

class Student{
	int id;
	String name;
	
	Student(){
		System.out.println("Object Created");
		id = 1;
		name = "sachin";
	}
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Student(int id){
		this.id = id;
	}
	
	void displayStudentDetails()
	{
		System.out.println("id "+id);
		System.out.println("name "+name);
	}
}

public class ParameterizedConstructer {
	public static void main(String[] args) {
		
		Student e2 = new Student(2, "Rahul");
		e2.displayStudentDetails();
		
		Student e3 = new Student(3);
		e3.displayStudentDetails();
	}
}
