package day17;

import java.util.*;

class Product {
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;	
	}
}
//Without Stream Function
public class StreamExample {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();		//list variable
		list.add(new Product(1, "dell1" , 25000));
		list.add(new Product(2, "dell2" , 26000));
		list.add(new Product(3, "dell3" , 28000));
		list.add(new Product(4, "dell4" , 29000));
		list.add(new Product(5, "dell5" , 24000));
		List<Float> filter = new ArrayList<Float>();  		//Dummy variable to store the filtered value
		for(Product product:list) {
			if(product.price<25000) {
				filter.add(product.price);
			}
		}
		System.out.println(filter);
	}

}
