package lab6;
import java.util.*;

public class Exercise5 {
	static int getSecondSmallest(int[] arr) {
		List<Integer> arrL = new ArrayList<Integer>();
		for (Integer i: arr) {
			arrL.add(i);
		}
		Collections.sort(arrL);
		return arrL.get(1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
		sc.close();

	}

}
