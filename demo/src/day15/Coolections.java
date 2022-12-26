package day15;

import java.util.*;

public class Coolections {

	public static void main(String[] args) {
		List<String> a = new Vector();			//create object for Array List
		a.add("hi");
		a.add("hello");
		
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		a.clear();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		a.remove(0);
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
