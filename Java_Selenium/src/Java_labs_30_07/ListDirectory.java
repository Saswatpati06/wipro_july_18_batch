package Java_labs_30_07;



import java.io.File;

public class ListDirectory {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\HP\\OneDrive\\Desktop\\L& T");

        // Check if it is a directory
        if (dir.exists() && dir.isDirectory()) {
            String[] names = dir.list();

            if (names != null) {
                for (String name : names) {
                    System.out.println(name);
                }
            } else {
                System.out.println("The directory is empty or cannot be read.");
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }
}
