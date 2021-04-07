package com.cap.client;

import java.util.*;

import com.cap.bean.Product;
import com.cap.service.IProductService;
import com.cap.service.ProductServiceImpl;

public class ClientApp {

	public static void main(String[] args) {
		IProductService productService = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id:");
		int productId = sc.nextInt();
		int totalPrice = 0;
		
		Product product = productService.getProductById(productId);
		if(product != null) {
			System.out.println("Enter product quantity:");
			int quantity = sc.nextInt();
			System.out.println("Product Found");
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getCategory());
			System.out.println(product.getPrice());
			product.setQuantity(quantity);
			totalPrice = product.getQuantity()*product.getPrice();
			System.out.println("Total price of product: "+totalPrice);
		}
		else {
			System.out.println("No product found");
		}
	}

}
