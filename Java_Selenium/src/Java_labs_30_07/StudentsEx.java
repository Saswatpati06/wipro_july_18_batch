package Java_labs_30_07;


import java.io.Serializable;

public class StudentsEx implements Serializable {
    private String name;
    private int roll;

    public StudentsEx(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

   
    public String toString() {
        return "Name: " + name + ", Roll: " + roll;
    }
}

