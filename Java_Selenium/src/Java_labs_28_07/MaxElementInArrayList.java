package Java_labs_28_07;

import java.util.ArrayList;

public class MaxElementInArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(67);
        numbers.add(34);
        numbers.add(89);
        numbers.add(45);
        
        if (numbers.isEmpty()) {
            System.out.println("The list is empty. No maximum element.");
            return;
        }

        int maxVal = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > maxVal) {
                maxVal = numbers.get(i);
            }
        }

        System.out.println("The maximum element in the ArrayList is: " + maxVal);
    }
}
