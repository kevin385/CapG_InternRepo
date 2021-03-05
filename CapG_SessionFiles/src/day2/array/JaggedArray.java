package day2.array;

public class JaggedArray {

	public static void main(String[] args) {
		int myArray[][] = new int[4][];
		myArray[0] = new int[3];
		myArray[1] = new int[5];
		myArray[2] = new int[2];
		myArray[3] = new int[7];
		
		for (int i=0; i<myArray.length; i++) {
			for(int j=0; j<myArray[i].length; j++) {
				System.out.print(myArray[i][j] +" ");
			}
			System.out.println();
		}
	}

}
