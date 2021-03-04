package Day2.array;

public class ArraySum {

	public static void main(String[] args) {
		int a[] = {1,2,5,9,4}, total_sum = 0, odd_sum = 0, even_sum = 0;
		for (int i=0;i<a.length;i++) {
			total_sum += a[i];
			if(a[i]%2 == 0)
				even_sum += a[i];
			else
				odd_sum += a[i];
		}
		System.out.println("Total Sum: "+total_sum);
		System.out.println("Odd Sum: "+odd_sum);
		System.out.println("Even Sum: "+even_sum);
	}

}
