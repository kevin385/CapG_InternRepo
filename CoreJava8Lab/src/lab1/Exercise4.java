package lab1;
import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		for (int i=0; i<num; i++) {
			int factorCount=0;
			for(int j=1; j<=Math.sqrt(i); j++)
			{
				if(i%j==0)
					factorCount++;
			}
			if(factorCount<2)
				System.out.print(i+" ");
		}
		sc.close();
	}

}
