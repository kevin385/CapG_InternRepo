package day6.io;
import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("two.txt");
		pw.write(100);	//converts to char
		pw.write(100);

		pw.flush();
		pw.close();
	}

}
