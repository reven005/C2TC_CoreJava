package day5;

public class ClassC extends ClassB{			//child 1 class
	void aa() {
		System.out.println("This is AA in Class C");
	}
	void bb() {
		System.out.println("This is BB in Class C");
	}
	void cc() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC obj = new ClassC();
		obj.zz();
		obj.yy();
		obj.bike();
		obj.bus();
		obj.car();
		obj.aa();
		obj.bb();
	}

}
