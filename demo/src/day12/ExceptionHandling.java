package day12;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int b = i.nextInt();
		try {
			int a = 5/b;
			System.out.println(a);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		int c = i.nextInt();
		try {
			int d = 5/c;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Whatever happens i will get executed");
		}
		System.out.println("Remaining will get executed");

	}

}
