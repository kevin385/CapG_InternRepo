package day18;

public class SplitDemo {

	public static void main(String[] args) {
		String name = "Robert.James.Doe";
		String [] result = name.split("\\.");
		for (String str: result) {
			System.out.println(str);
		}
	}

}
