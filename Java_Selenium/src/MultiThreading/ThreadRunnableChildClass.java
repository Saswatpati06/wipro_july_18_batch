package MultiThreading;

public class ThreadRunnableChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10; //number pf threads
		
		for (int i=0;i<n;i++)
		{
			Thread object = new Thread(new ThreadUsingRunnableInterface());
			
			object.start();
		}
		
			
	}

}
