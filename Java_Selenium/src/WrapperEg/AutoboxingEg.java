package WrapperEg;

public class AutoboxingEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wrapper is the process of converting the primitive data types into object 
		// 8 wrapper classes- Byte, Boolean, Character, Double, Float, Integer, Long , Short
		// autoboxing convert data type to object
		
		int a = 78;
		
		// autoboxing 
		
		Integer i = Integer.valueOf(a);
		
		System.out.println(i);
		
		//unboxing
		
			Integer a1 = new Integer(3);
			
			int i1 = a1.intValue();
			
			int j = a1;
			
			System.out.println(i1);
			System.out.println(j);		
		
	}

}
