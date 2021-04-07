package lab9;

import java.util.*;

@FunctionalInterface
interface Inter1 {
	boolean authentication(String username, String password);
}

public class Exercise3 {

	public static void main(String[] args) {
		Inter1 i1 = (username, password) -> {
			if(!username.equals("username1")) {
				System.out.println("Username invalid");
				return false;
			}
			if(!password.equals("pass1234"))	{
				System.out.println("Password invalid");
				return false;
			}
			System.out.println("Success");
			return true;
		};
		Scanner sc = new Scanner(System.in);
		String uname, pword;
		System.out.println("Enter Username: ");
		uname = sc.nextLine();
		System.out.println("Enter Password: ");
		pword = sc.nextLine();
		i1.authentication(uname, pword);
		sc.close();
	}

}
