package day8.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Product {
	int pid;
	String pname;
	int price;
	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
}

public class Task2 {

	public static void main(String[] args) {
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1, "Prod1", 500));
		prodList.add(new Product(2, "Prod2", 400));
		prodList.add(new Product(3, "Prod3", 200));
		prodList.add(new Product(4, "Prod4", 100));
		prodList.add(new Product(5, "Prod5", 600));
		
		System.out.println("Product List: "+ prodList);
	
		Iterator<Product> it = prodList.iterator();
		while(it.hasNext()) {
			Product e = it.next();
			if (e.price<300)
				System.out.println("ID: "+e.pid+" Name: "+e.pname+" Price: "+e.price);
		}

	}

}
