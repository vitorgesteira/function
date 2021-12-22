package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/* função map aplica uma função a cada elemento de uma stream
		 * map gera uma nova stream com os elementos transformados*/

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/* list.stream(): converte a lista para stream
		 * map(Product::nonStaticUpperCaseName): transforma a lista
		 * collect(Collectors.toList()): transforma de stream para lista de novo
		 * List<String> names: salva na nova lista de nomes*/
		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
