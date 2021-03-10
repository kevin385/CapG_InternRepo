package day6.io;

import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("one.txt"));
		String r = br.readLine();
		while(r != null) {
			System.out.println(r);
			r = br.readLine();
		}
		br.close();
	}

}
