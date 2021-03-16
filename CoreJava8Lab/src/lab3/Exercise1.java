package lab3;

import java.util.*;

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int token, sum = 0;
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreElements()) {
			token = Integer.valueOf(st.nextToken());
			System.out.println(token);
			sum += token;
		}
		System.out.println(sum);
		sc.close();
	}

}
