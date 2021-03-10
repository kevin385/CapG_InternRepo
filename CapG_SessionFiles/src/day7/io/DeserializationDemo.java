package day7.io;

import java.io.*;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("four.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee e = (Employee) ois.readObject();
		System.out.println(e.id +" "+e.name+" "+e.age);
		ois.close();
	}

}
