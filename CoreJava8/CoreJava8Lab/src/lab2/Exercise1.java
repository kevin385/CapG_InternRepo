package lab2;
import java.util.*;
public class Exercise1 {

	public int getSecondSmallest(int arr[], int n)
	{
		int temp;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		return arr[n-2];
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Exercise1 exercise1 = new Exercise1();
		int n, smallEle;
		System.out.println("Enter size of array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter array:");

		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		smallEle = exercise1.getSecondSmallest(arr, n);
		System.out.println("The second smallest element is "+smallEle);
		sc.close();
	}
}
