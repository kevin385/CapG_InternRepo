package day6.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello"); // default 16  =>  new capacity = old capacity * 2+2
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Length: " + sb.length());
		sb.append("hello welcome to java");
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Length: " + sb.length());
	}

}
