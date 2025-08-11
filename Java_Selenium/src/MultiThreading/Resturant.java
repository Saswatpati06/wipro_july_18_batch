package MultiThreading;

public class Resturant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new CookingTask("Pasta");
		Thread t2 = new CookingTask("Dosa");
		Thread t3 = new CookingTask("Salad");
		Thread t4 = new CookingTask("Dessert");
		Thread t5 = new CookingTask("Rice");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
