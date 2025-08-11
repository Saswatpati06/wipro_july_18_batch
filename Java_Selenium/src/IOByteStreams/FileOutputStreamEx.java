package IOByteStreams;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

    public static void main(String[] args) {

        String data = "I am attending the java training class";

        try {
            // Create a FileOutputStream to write to the file
            FileOutputStream output = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\New folder\\Untitled.txt");

            byte[] array = data.getBytes();  
            output.write(array);            
            output.close();                  

            System.out.println("Data written to file successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
