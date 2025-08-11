package IOCharStreams;

import java.io.*;

public class StringWriteRead {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("C://Users//HP//OneDrive//Desktop//L& T//Java.txt")
        );
        bw.write("This is a sample String.");
        bw.close();

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
