package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Televisão", 900.00));
		list.add(new Product("Fogão", 700.00));
		list.add(new Product("Notebook", 2500.00));

		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().compareTo(p2.getName().toUpperCase());
		};

		list.sort(comp);

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
