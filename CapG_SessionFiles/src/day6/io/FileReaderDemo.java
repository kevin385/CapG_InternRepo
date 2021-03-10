package day6.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abc.txt");//one by one character

		int r = fr.read();
		while(r!=-1) {
			System.out.print((char)r);
			r = fr.read();//it will read next character
		}
		fr.close();
	}

}
