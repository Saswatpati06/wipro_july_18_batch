package Java_all_days_program;

public class EncapsulationEg
{
	// private fields - hidden fro outside access
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	
	//public getter method for name
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	// public getter method for age
	public int getAge()
	{
		return age;
	}
	
	
	//public setter method for age
	public int setAge(int age)
	{
		return this.age = age;
	}
	
	
	 public static void main(String[] args)
	 {
		 EncapsulationEg obj = new EncapsulationEg();
		 obj.setAge(23);
		 obj.setName("Saswat");
			
		 System.out.println(obj.getAge());
		 System.out.println(obj.getName());
		 
	 }
}




