package Java_labs_28_07;

import java.util.ArrayList;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(42);
        numbers.add(27);
        numbers.add(33);
        numbers.add(42);
        numbers.add(9);
        Integer max = null;
        Integer secondMax = null;

        for (Integer num : numbers) {
            if (max == null || num > max) {
                secondMax = max;
                max = num;
            } else if ((num < max) && (secondMax == null || num > secondMax)) {
                secondMax = num;
            }
        }

        if (secondMax != null) {
            System.out.println("The second-largest element is: " + secondMax);
        } else {
            System.out.println("The ArrayList does not have a unique second-largest element.");
        }
    }
}

