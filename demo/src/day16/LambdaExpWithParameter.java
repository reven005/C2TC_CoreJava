package day16;


public class LambdaExpWithParameter {

	public static void main(String[] args) {
		IsOdd o = (a) -> a % 2 != 0 ? true : false;
		boolean r = o.CheckOdd(8);
		System.out.println("Reslut is : "+r);
		

	}

}
