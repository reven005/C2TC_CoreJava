package day16;

import java.util.*;

public class Iteration {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Reven");
		list.add("Jana");
		list.add("Jackie");
		list.add("Rajesh");
		
		list.forEach(
				(n) -> {System.out.println(n);}				//Lambda Expression
				);	

	}

}
