package day16;

@FunctionalInterface
interface Say{
	String say(String message);
}

public class MultipleExpression {

	public static void main(String[] args) {
		Say s = (message) -> {
			String s1 = "I can make,";
			String s2 = s1 + message;
			return s2;
		};
		System.out.println(s.say("Chocolate Cake."));
	}

}
