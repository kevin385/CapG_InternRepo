package day2.array;

public class Array2 {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[][] = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<b.length;i++) {
			for (int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
