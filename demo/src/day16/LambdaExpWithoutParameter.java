package day16;

public class LambdaExpWithoutParameter {

	public static void main(String[] args) {
		Statement s = () -> {return "Good Evening Everyone";};
		System.out.println(s.greet());

	}

}
