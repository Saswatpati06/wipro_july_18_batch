package Java_all_days_program;

public interface interface1 
{
	// abstract methods
	
	abstract void display();
	
	void read();
	
	
	 
	static void write()
	{
		System.out.println("Writing in interface");
	}
	
	default void show()
	{
		System.out.println("Showing");
	}
	
	public static final String employeename = "Jaya";
	
	int employeeId = 6767;
	
}
