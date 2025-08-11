package IOCharStreams;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteReaderWriteEx {

    public static void main(String[] args) throws IOException {
        
        // Write to the file
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("C://Users//HP//OneDrive//Desktop//L& T//Java.txt")
        );
        bw.write("I am the file writer");
        bw.close();

        // Read from the file
        BufferedReader br = new BufferedReader(
            new FileReader("C://Users//HP//OneDrive//Desktop//L& T//Java.txt")
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
