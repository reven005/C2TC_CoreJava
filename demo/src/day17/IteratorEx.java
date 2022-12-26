package day17;

import java.util.stream.Stream;
//Program to print first 10 values which is Divisble by 5
public class IteratorEx {

	public static void main(String[] args) {
		Stream.iterate(10, element->element+10)
		.filter(element->element%6==0)
		.limit(5)
		.forEach(System.out::println);

	}

}
