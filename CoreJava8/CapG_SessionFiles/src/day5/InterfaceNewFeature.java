package day5;

interface College {
	void dept();
	
	default void lab() {
		System.out.println("You have to do lab.");
	}
}

class Mech implements College {
	public void dept() {
		System.out.println("This is mech department");
	}
	
	public void lab() {
		System.out.println("You have to do lab1 exercise");
	}
}

public class InterfaceNewFeature {

	public static void main(String[] args) {
		Mech me = new Mech();
		me.dept();
		me.lab();

	}

}
