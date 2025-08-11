package Java_labs_28_07;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInSet {
    public static void main(String[] args) {
        // Sample data with duplicates
        String[] items = {"Table", "Chair", "Lamp", "Table", "Sofa", "Lamp", "Desk"};

        Set<String> uniqueItems = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String item : items) {
            
            if (!uniqueItems.add(item)) {
                duplicates.add(item);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
