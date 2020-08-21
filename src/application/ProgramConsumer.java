package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProgramConsumer {
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double percent = 1.5;
		//list.forEach(new PriceUpdate());
		//list.forEach(Product::staticPriceUpdate);
		//list.forEach(Product::nonStaticPriceUpdate);
		//Consumer<Product> con = p -> p.setPrice(p.getPrice() * percent);
		//list.forEach(con);
		list.forEach(p -> p.setPrice(p.getPrice() * percent));
		
		list.forEach(System.out::println);
	}
}
