package Java_all_days_program;

public class AbstractChildClassEg extends AbstractClassEg
{
	void makesound()
	{
		System.out.println("Animals makes sound");
	}
	public static void main(String[] args)
	{
		AbstractChildClassEg obj = new AbstractChildClassEg();
		
		obj.eat();
		obj.makesound();
		System.out.println(animalName);
	
	}
}
