package Java_all_days_program;

abstract class AbstractClassEg 
{
	//abstract methods
	
	abstract void makesound();
	
	//concrete methods
	public void eat()
	{
		System.out.println("The animal eats food");
	}
	
	AbstractClassEg()
	{
		System.out.println("Creating constructor in abstract class");
	}
	
	// instance variables
	
	public static String animalName = "Lion";
	
	// final variable
	
	private final String animalBehaviour = "Roars";
	
	 
}
