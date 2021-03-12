package day9;

class Fruit {
	private String name;
	private String taste;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	void taste() {
		System.out.println("Name of fruit: "+getName());
		System.out.println("Taste of fruit: "+getTaste());
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", taste=" + taste + "]";
	} 
}

class Apple extends Fruit {
	public Apple() {
		super();
		setName("Apple");
		setTaste("Tastes like apple");
	}
	
}

class Orange extends Fruit {
	public Orange() {
		super();
		setName("Orange");
		setTaste("Tastes like Orange");
	}
}

public class Question1 {

	public static void main(String[] args) {
		Apple ap = new Apple(); 
		Orange or = new Orange();
		System.out.println(ap);
		System.out.println(or);
	}

}
