package Java_all_days_program;

public class ChildInterface implements InterfaceA, InterfaceB {
  
    public void display() {
        System.out.println("Display method from ChildClass");
    }
    
    public static void main(String[] args) {
    	ChildInterface obj = new ChildInterface();
        obj.display(); 
        InterfaceA.display();
        InterfaceB.display();
        
    }
}



