package Java_labs_28_07;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(37);
        numbers.add(71);
        numbers.add(16);
        numbers.add(3);
        numbers.add(81);

        System.out.println("Before sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);
    }
}

