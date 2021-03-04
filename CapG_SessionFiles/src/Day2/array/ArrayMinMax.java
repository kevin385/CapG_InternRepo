package Day2.array;

public class ArrayMinMax {

	public static void main(String[] args) {
		int a[] = {1,2,5,9,4}, min = a[0], max = a[0];
		for (int i=1;i<a.length;i++) {
			if(a[i]<min)
				min = a[i];
			else if (a[i]>max)
				max = a[i];
		}
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
	}

}
