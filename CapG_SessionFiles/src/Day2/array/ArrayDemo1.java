package Day2.array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println("Length: "+a.length);
		for(int i=0; i<a.length;i++) {
			a[i] = i;
		}
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
