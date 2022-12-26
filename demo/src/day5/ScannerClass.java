package day5;

import java.util.Scanner;

//import java.util.*;


public class ScannerClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Integer");
		int a = s.nextInt();
		System.out.println("Enter a Decimal");
		double b = s.nextDouble();
		System.out.println("Enter True or False");
		boolean c = s.nextBoolean();
		System.out.println("Enter a Letter");
		char d = s.next().charAt(0);
	}
}
