package IOByteStreams;

import java.io.FileInputStream;

public class InputStreamsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

				FileInputStream input = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\New folder\\Untitled.txt");
				System.out.println("Data in the file");

				// reads the byte

				int i =  input.read();

				while (i != -1) {

				System.out.print((char) i);

				// reads the next byte from the file

				i = input.read();

				}

				input.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
