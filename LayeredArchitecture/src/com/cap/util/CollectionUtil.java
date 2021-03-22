package com.cap.util;

import java.util.*;
import com.cap.bean.*;

public class CollectionUtil {
	private static Map<Integer, Product> products = new HashMap<Integer, Product>();
	
	static {
		products.put(100, new Product(100, "Laptop", "Electronics", 78000));
		products.put(101, new Product(101, "Mobile", "Electronics", 46000));
		products.put(102, new Product(102, "T-Shirt", "cloth", 1500));
	}
	
	public static Map<Integer,Product> getProducts(){
		return products;
	}
}
