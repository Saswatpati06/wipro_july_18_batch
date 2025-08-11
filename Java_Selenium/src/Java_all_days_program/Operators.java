package Java_all_days_program;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Unary
		
		int q = 10;
		
		
		System.out.println(q++);
		System.out.println(q--);
		System.out.println(++q);
		System.out.println(--q);
		
		//arithematic operators
		
		int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));    
        System.out.println("Subtraction: " + (a - b));    
        System.out.println("Multiplication: " + (a * b));  
        System.out.println("Division: " + (a / b));        
        System.out.println("Modulus: " + (a % b));  
        
		//shift operators
		//left shift <<
		System.out.println(10<<2); // 10 * 2^2 = 40
		
		System.out.println(10<<3); // 10 * 2 ^2 = 80
		
		//right shift >>
		
        System.out.println(10>>2); // 10 / 2^2 = 2
		
		System.out.println(10>>3); // 10/3^3 = 1
		
		
		// Realtional Operators 
		
		int c = 10;
        int d = 5;

        System.out.println("c == d: " + (c == d));   // false
        System.out.println("c != d: " + (c != d));   // true
        System.out.println("c > d: " + (c> d));     // true
        System.out.println("c < d: " + (c < d));     // false
        System.out.println("c >= d: " + (c >= d));   // true
        System.out.println("c <= d: " + (c <= d));   // false
    
	
	
	  // Bitwise Operators
	
	      int m = 6;   // Binary: 0110
          int n = 4;   // Binary: 0100
          
          System.out.println("m & n = " + (m & n));      // AND -> 4 (0100)
          System.out.println("m | n = " + (m | n));      // OR  -> 6 (0110)
          System.out.println("m ^ n = " + (m ^ n));      // XOR -> 2 (0010)
          System.out.println("~m = " + (~m));            // NOT -> -7
          System.out.println("m << 1 = " + (m << 1));    // Left Shift -> 12 (1100)
          System.out.println("m >> 1 = " + (m >> 1));    // Right Shift -> 3 (0011)
          System.out.println("m >>> 1 = " + (m >>> 1));  // Unsigned Right Shift -> 3
          
          
       //Logical Operators
          
          boolean o = true;
          boolean p = false;

          System.out.println("o && p: " + (o && p));   // false
          System.out.println("o || p: " + (o || p));   // true
          System.out.println("!o: " + (!o));           // false
          System.out.println("!p: " + (!p));           // true
          
          
        // Assignment Operators
          
          int i = 20;
          int j = 5;

          System.out.println("Initial i: " + i);
          
          i += j;
          System.out.println("After i += j: " + i);   // 25

          i -= j;
          System.out.println("After i -= j: " + i);   // 20

          i *= j;
          System.out.println("After i *= j: " + i);   // 100

          i /= j;
          System.out.println("After i /= j: " + i);   // 20

          i %= j;
          System.out.println("After i %= j: " + i);   // 0
      
  
          // ternary operator
	
	int k = 10;
    int l = 20;

    String result = (k > l) ? "k is greater" : "l is greater";

    System.out.println(result);
}
}
	   





