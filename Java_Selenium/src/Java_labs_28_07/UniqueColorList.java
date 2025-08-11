package Java_labs_28_07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueColorList {
    public static void main(String[] args) {
       
        Set<String> colorSet = new HashSet<>();
        colorSet.add("Violet");
        colorSet.add("Indigo");
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Green");
        colorSet.add("Yellow");
        colorSet.add("Red");

        ArrayList<String> colorList = new ArrayList<>(colorSet);

        System.out.println("Unique colors:");
        for (String color : colorList) {
            System.out.println(color);
        }
    }
}

