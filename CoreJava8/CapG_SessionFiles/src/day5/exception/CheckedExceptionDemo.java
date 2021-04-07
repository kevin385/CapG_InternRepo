package day5.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		int a = 10;
		File f1 = new File("abc.txt");
		System.out.println(2/0);	//runtime
		f1.createNewFile();			//compile time
	}

}
