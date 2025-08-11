package Java_labs_30_07;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToByteArray {
    public static void main(String[] args) {
        // ✅ This should be the path to a FILE, not a folder
        File file = new File("C:\\Users\\HP\\OneDrive\\Desktop\\L& T\\Student.txt");

        if (!file.exists() || !file.isFile()) {
            System.out.println("The specified path is not a valid file.");
            return;
        }

        byte[] buffer = new byte[(int) file.length()];

        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(buffer);
            System.out.println("Read " + buffer.length + " bytes.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
