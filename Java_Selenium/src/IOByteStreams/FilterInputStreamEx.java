package IOByteStreams;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
public class FilterInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//filter it and pass to on to the underlying streams
		
		//filter streams folder data as they read and write data in the input
		
		FileInputStream fis = null;
		BufferedInputStream filterinput = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\New folder\\Untitled.txt");
			//wrap file input stream with buffered input stream
			
			filterinput = new BufferedInputStream(fis);
			
			int data;
			
			while ((data = filterinput.read() )!= -1)
			{
				System.out.println((char) data);
			}
			
			fis.close();
		}
		catch (Exception e)
		{
			System.out.println();
		}
		
	}
	
}


