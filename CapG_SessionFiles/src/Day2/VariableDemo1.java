package Day2;

public class VariableDemo1 {
	
	int var=1;			//global variable
	static int svar=10;	//static variable
	void display1() {
		int var1=100;
		System.out.println("Global Variable: "+var);
		System.out.println("Local Variable: "+var1);
		System.out.println("Static Variable: "+svar);
	}
	void display2() {
		int var2=200;
		System.out.println("Global Variable: "+var);
		System.out.println("Local Variable: "+var2);
	}
	
	public static void main(String[] args) {
		VariableDemo1 vd = new VariableDemo1();
		vd.display1();
		vd.display2();
	}
}
