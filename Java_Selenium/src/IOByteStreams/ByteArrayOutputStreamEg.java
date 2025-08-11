package IOByteStreams;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "This is a line of text inside the string.";
		
		try
		{
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] array = data.getBytes();
			
			out.write(array);
			
			String streamData = out.toString();
			System.out.println("Output stream:"+ streamData);
			
			out.close();
			
		}catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
