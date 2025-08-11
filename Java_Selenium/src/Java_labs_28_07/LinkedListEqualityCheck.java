package Java_labs_28_07;

import java.util.LinkedList;


public class LinkedListEqualityCheck {

    // Method to check if two linked lists are equal
    public static boolean areListsEqual(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        return list1.equals(list2);
    }

    public static void main(String[] args) {
        // Create and add values to the first LinkedList
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        // Create and add values to the second LinkedList
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        // Compare the two LinkedLists
        if (areListsEqual(list1, list2)) {
            System.out.println("The LinkedLists are equal.");
        } else {
            System.out.println("The LinkedLists are NOT equal.");
        }
    }
}



