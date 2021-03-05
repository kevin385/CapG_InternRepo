package day2.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][] = new int[4][5];
		System.out.println(a.length);
		System.out.println(a[0].length);
		a[1][4] = 1;
		a[2][3] = 1;
		a[0][4] = 1;
		System.out.println("=========");
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("=========");
	}

}
