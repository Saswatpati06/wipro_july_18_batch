package IOCharStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializationeg {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		// create the stream and read the object
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\L& T\\Test1.txt"));
		
		Student s = (Student)in.readObject();
		
		System.out.println(s.id + " " +s.name);
		
		in.close();
	}

}


