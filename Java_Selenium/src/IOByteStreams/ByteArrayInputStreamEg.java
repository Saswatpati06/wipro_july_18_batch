package IOByteStreams;



import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEg {

    public static void main(String[] args) {

        byte[] array = {1, 2, 3, 4};

        try {
            // Correctly declare and initialize the input stream
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            for (int i = 0; i < array.length; i++) {
                int data = input.read(); // Read one byte at a time
                System.out.println(data);
            }

            input.close(); // Close the input stream

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



