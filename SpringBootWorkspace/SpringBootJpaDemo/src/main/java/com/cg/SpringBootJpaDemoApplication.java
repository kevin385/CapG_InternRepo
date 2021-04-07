package com.cg;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.ProductDaoI;
import com.cg.entity.Product;

@SpringBootApplication
public class SpringBootJpaDemoApplication implements CommandLineRunner{
	
	@Autowired
	ProductDaoI daoI;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Spring Boot");
	
		Product p1 = new Product(3, "Shirt", "Cloth", 3000);

		daoI.save(p1);
		System.out.println("=====Saved=====");
		
		System.out.println("=====Find=====");
		Optional<Product> product1 = daoI.findById(1);
		if(product1.isPresent()) {
			System.out.print(product1.get().getId());
			System.out.print(product1.get().getName());
			System.out.print(product1.get().getPrice());
			System.out.print(product1.get().getCategory());
			System.out.println();
		} else {
			System.out.println("No product found with that ID");
		}
		
		System.out.println("=====FindAll=====");
		List<Product> productList = daoI.findAll();
		productList.forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getPrice()+" "+s.getCategory()));
		
		System.out.println("=====FindByName=====");
		List<Product> p2 = daoI.findByName("Shirt");
		p2.forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getPrice()+" "+s.getCategory()));
		
		System.out.println("=====FindByCategory=====");
		List<Product> p3 = daoI.findByCategory("Electronics");
		p3.forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getPrice()+" "+s.getCategory()));
		
		System.out.println("=====FindByNameAndCategory=====");
		Product p4 = daoI.findByNameAndCategory("Laptop", "Electronics");
		System.out.println(p4);
		
		List<Product> p5 = daoI.findByCategoryStartingWith("C");
		System.out.println(p5);
		
	}

}
