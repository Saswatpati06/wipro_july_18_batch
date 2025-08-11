package IOCharStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	try {
		// serialization is a process of converting objects into bytes
		
		// write Object()
		
		//read Object()
        
		Student s1 = new Student(211,"John");
		
	// creating the output stream writing the object
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\L& T\\Test1.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		
		// closing the stream
		
		out.close();
		System.out.println("Object is serialized");
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
}
