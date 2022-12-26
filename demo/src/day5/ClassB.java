package day5;

public class ClassB extends ClassA{			//parent class
	void yy() {
		System.out.println("This is a YY in Class B");
	}
	void zz() {
		System.out.println("This is a ZZ in Class B");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj = new ClassB();
		obj.bike();
		obj.car();
		obj.bus();
		//obj.truck();		//Private method cannot be inherited
		obj.yy();
		obj.zz();
		
	}

}


//1. the private method cannot be inherited
//2. We need to create object for child class. 
//3. Final keyword. 