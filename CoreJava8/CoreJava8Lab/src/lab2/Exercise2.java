package lab2;
import java.util.*;
public class Exercise2 {

	public String[] sortStrings(String[] arr, int n)
	{
		for (int i=0; i<n; i++) {
			arr[i] = arr[i].toLowerCase();
		}
		Arrays.sort(arr);
		for(int i=0; i<((n+1)/2); i++) {
			System.out.println(arr[i].toUpperCase());
		}
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Exercise2 exercise2 = new Exercise2();
		int n;
		System.out.println("Enter number of elements:");
		n=sc.nextInt();
		String arr[] = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		arr = exercise2.sortStrings(arr, n);
		for(int i=(n+1)/2; i<n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
		
	}

}
