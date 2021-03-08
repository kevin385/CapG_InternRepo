package lab2;
import java.util.*;

public class Exercise3 {

	public int[] getSorted(int[] arr) {
		int n = arr.length;
		int revArray[] = new int[n];
		for (int i=0; i<arr.length; i++) {
			int temp = arr[i], m, reverse=0;
			while(temp != 0) {
				m = temp%10;
				reverse = reverse*10+m;
				temp = temp/10;
			}
			revArray[i] = reverse;
		}	
		Arrays.sort(revArray);
		return revArray;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Exercise3 exercise3 = new Exercise3();
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array:");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int sortedArray[] = exercise3.getSorted(arr);
		for(int i=0; i<n; i++) {
			System.out.println(sortedArray[i]);
		}
		sc.close();
	}

}
