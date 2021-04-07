package day6.io;
import java.io.*;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Users\\kevin\\Documents\\abc.txt");
		System.out.println(f.exists());

		if(f.exists()) {
			System.out.println("File is present");
		}
		else {
			System.out.println("File is not present");
			System.out.println("I am creating file now");
			f.createNewFile();
		}
	}

}
