package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class ProgramFunction1 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		List<String> listConvertida;
		//listConvertida = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//listConvertida = list.stream().map(Product::staticGetUpperCaseNome).collect(Collectors.toList());
		//listConvertida = list.stream().map(Product::nonStaticGetUpperCaseNome).collect(Collectors.toList());
		//Function<Product, String> function = p -> p.getName().toUpperCase();
		//listConvertida = list.stream().map(function).collect(Collectors.toList());
		listConvertida = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		listConvertida.forEach(System.out::println);
	}
}
