package IOCharStreams;

import java.io.*;

public class CharArrayWriteRead {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//HP//OneDrive//Desktop//L& T//Java.txt"));
        char[] chars = "HelloCharArray!".toCharArray();
        bw.write(chars);  // writes full char array
        bw.newLine();
        bw.write(chars, 5, 9);  // writes "CharArray"
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("C://Users//HP//OneDrive//Desktop//L& T//Java.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}


/*package IO_CharStream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
 
public class CharArrayWriter_reader {
 
	public static void main(String[] args) {
try {
	CharArrayWriter ch = new CharArrayWriter();
	ch.write("Hello boys");
	ch.write(" I am Sanjay singh Mehara");
 
	FileWriter fw=new FileWriter("C:\\Users\\my pc\\eclipse-workspaceWipro\\SDET_WIPRO\\src\\IO_CharStream\\CharArrayWriter_Reader");
	ch.writeTo(fw);
	fw.close();
	ch.close();
	CharArrayReader cr=new CharArrayReader(ch.toCharArray());
	int i=cr.read();
	while(i!=-1) {
		System.out.print((char)i);
		i=cr.read();
		}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
 
}*/