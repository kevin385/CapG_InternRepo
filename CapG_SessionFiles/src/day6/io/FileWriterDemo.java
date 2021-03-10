package day6.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt",true); //true for append
		fw.write("This is my file\n");
		fw.write("hello");
		fw.write("67+\n");
		
		fw.flush();
		fw.close();
	}

}
