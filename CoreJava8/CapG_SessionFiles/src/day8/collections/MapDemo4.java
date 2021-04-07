package day8.collections;

import java.util.*;

class Student {
	private int id;
	private String name;
	private String dept;
	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class MapDemo4 {

	public static void main(String[] args) {
		
		HashMap<Student, Integer> studentMarkList = new HashMap<Student, Integer>();
		studentMarkList.put(new Student(1,"Sachin","Mech"), 89);
		studentMarkList.put(new Student(1,"Sachin","Mech"), 90);
		studentMarkList.put(new Student(3,"Sachin","Mech"), 76);
		
		for(Map.Entry<Student, Integer> stu: studentMarkList.entrySet()) {
			System.out.println(stu);
		}

	}

}
