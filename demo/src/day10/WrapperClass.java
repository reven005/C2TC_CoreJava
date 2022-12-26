package day10;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		
		//conversion of primitive to object(Wrapper Class)
		int b = 5;								//primitive datatype
		Integer c = Integer.valueOf(b); 		
		double d = 10.5;
		Double e = Double.valueOf(d);			//autoboxing
		short f = 2;
		Short g = Short.valueOf(f);				//autoboxing
		
		//Converting object to primitive 
		Integer h = 11;							//Object datatype
		int i = h.intValue();					//unboxing
		Double j = 11.1;
		double k = j.doubleValue();				//unboxing
		
	}

}
