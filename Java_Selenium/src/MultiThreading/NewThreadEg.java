package MultiThreading;


//Define the class that extends Thread
public class NewThreadEg extends Thread {

 // Override the run() method
 public void run() {
     System.out.println("Thread is running");
 }

 // Main method to start the thread
 public static void main(String[] args) {
     NewThreadEg t1 = new NewThreadEg();
     t1.start();  // This calls the run() method in a new thread
 }
}

