package day17;

import java.util.ArrayList;
import java.util.List;

public class StreamCount {
	public static void main(String args[]) {
		List<Product> list = new ArrayList<Product>();		//list variable
		list.add(new Product(1, "dell1" , 25000));
		list.add(new Product(2, "dell2" , 26000));
		list.add(new Product(3, "dell3" , 28000));
		list.add(new Product(4, "dell4" , 29000));
		list.add(new Product(5, "dell5" , 27000));
		
		long c = list.stream()
				.filter(product->product.price>25000)
				.count();
		System.out.println(c);
		
	}

}
