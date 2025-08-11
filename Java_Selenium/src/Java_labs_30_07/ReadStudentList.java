package Java_labs_30_07;
import java.io.*;

public class ReadStudentList {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\L& T\\Student.txt"))) {

            while (true) {
                StudentsEx s = (StudentsEx) in.readObject();
                System.out.println(s);
            }
        } catch (EOFException eof) {
            // End of file reached - do nothing
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}


