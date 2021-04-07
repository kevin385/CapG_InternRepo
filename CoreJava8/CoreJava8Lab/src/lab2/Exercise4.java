package lab2;

import java.util.Scanner;

public class Exercise4 {
	public int[] modifyArray(int[] arr) {
		int n= arr.length,t=0;
		if(n==0||n==1) {
			return arr;
		}
		int[] temp= new int[n];
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		int k=0;
		for(int i=0;i<n-1;i++) {
				if(arr[i]!=arr[i+1])
					temp[k++]=arr[i];
		}
		temp[k++]=arr[n-1];
		
		for(int i=0;i<k;i++) {
			arr[i]=temp[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise4 exercise4 = new Exercise4();
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the  array: ");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int modifiedArray[] = exercise4.modifyArray(arr);
		for(int i=0;i<n;i++) {
			System.out.println(modifiedArray[i]);
		}
		sc.close();
	}
}
