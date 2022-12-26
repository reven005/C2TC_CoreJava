package day17;

import java.util.*;
import java.util.stream.Collectors;

//With Stream Function
public class UsingStream {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();		//list variable
		list.add(new Product(1, "dell1" , 25000));
		list.add(new Product(2, "dell2" , 26000));
		list.add(new Product(3, "dell3" , 28000));
		list.add(new Product(4, "dell4" , 29000));
		list.add(new Product(5, "dell5" , 24000));
		
		
		List<Float> f = list.stream()
				.filter(p->p.price<25000)					//filter
				.map(p->p.price)							//fetch data
				.collect(Collectors.toList());
		System.out.println(f);
	}

}
