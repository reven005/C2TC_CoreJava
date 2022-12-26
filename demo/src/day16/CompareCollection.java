package day16;

import java.util.*;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class CompareCollection {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "HP", 29000));
		list.add(new Product(2, "Lenovo", 28000));
		list.add(new Product(5, "Mac", 40000));
		list.add(new Product(3, "Asur", 39000));
		list.add(new Product(4, "Dell", 35000));
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product p:list) {
			System.out.println(p.id+ " "+p.name+" "+p.price);
		}

	}

}
