package IOByteStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamEg {

    public static void main(String[] args) throws IOException {
        // Filter streams process data as they read/write
        // and pass it on to the underlying streams

        FileOutputStream fos = null;
        FilterOutputStream filterOutput = null;

        try {
            fos = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\New folder\\Untitled.txt");
            filterOutput = new BufferedOutputStream(fos);

            String text = "Hii! who are you??";
            filterOutput.write(text.getBytes());
            filterOutput.flush(); // Ensure data is written
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            if (filterOutput != null) {
                filterOutput.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
