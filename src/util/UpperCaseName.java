package util;

import java.util.function.Function;

import entities.Product;


public class UpperCaseName implements Function<Product, String>{
	/* Function<Product, String>: primeiro parametro é de entrada o segundo é de saida*/
		
	@Override
	public String apply(Product p) {//recebe um Product 
		return p.getName().toUpperCase();//retorna uma string
	}

}
