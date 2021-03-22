package lab9;

@FunctionalInterface
interface Test {
	void display();
}

class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void method1() {
		System.out.println("ID: "+id+"\nName: "+name);
	}
}

public class Exercise4 {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setId(202);
		stu1.setName("Kevin");
		Test t1 = stu1::method1;
		t1.display();
	}

}
