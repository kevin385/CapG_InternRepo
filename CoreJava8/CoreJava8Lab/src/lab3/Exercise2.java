package lab3;
import java.util.*;

public class Exercise2 {

	public String getImage(String str) {
		StringBuffer str1 = new StringBuffer(str);
		StringBuffer str2 = new StringBuffer(str);
		String rstr = str2.reverse().toString();
		str1.append('|');
		str1.append(rstr);
		return str1.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise2 ex = new Exercise2();
		System.out.println("Enter String: ");
		System.out.println(ex.getImage(sc.next()));
	}

}
