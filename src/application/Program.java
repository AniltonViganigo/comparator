package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Televis�o", 900.00));
		list.add(new Product("Fog�o", 700.00));
		list.add(new Product("Notebook", 2500.00));
		
		Collections.sort(list);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
