package IOCharStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// write to file using file writer
		
		FileWriter fw = new FileWriter("C://Users//HP//OneDrive//Desktop//L& T//Java.txt");
		
		fw.write("I am the file writer");
		
		fw.close();
		
		FileReader fr = new FileReader("C://Users//HP//OneDrive//Desktop//L& T//Java.txt");
		
		int i;
		while ((i = fr.read()) != -1) {
		System.out.print((char)i);
	}
		fr.close();
}
	}
