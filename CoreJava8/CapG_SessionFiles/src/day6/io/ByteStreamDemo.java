package day6.io;

import java.io.*;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("three.txt");
		fos.write(67);
		//fos.write("hello");	//not applicable for strings
		String msg = "hello";
		byte arr[] = msg.getBytes();
		
		fos.write('a');
		fos.write(arr);
		fos.write(arr, 1, 3);
		fos.flush();
		fos.close();
	}

}
