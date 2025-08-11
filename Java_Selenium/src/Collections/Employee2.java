package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Employee2 {
    int id;
    String name;

    Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee2 other = (Employee2) obj;
        return this.id == other.id && Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }

    public static void main(String[] args) {
        List<Employee2> employees = new ArrayList<>();

        employees.add(new Employee2(103, "Ravi"));
        employees.add(new Employee2(101, "Amit"));
        employees.add(new Employee2(102, "Zara"));
        employees.add(new Employee2(102, "Zara"));
        employees.add(new Employee2(104, "John"));
        employees.add(new Employee2(103, "Ravi"));

        System.out.println("All Employees:");
        for (Employee2 e : employees) {
            System.out.println(e);
        }

        Set<Employee2> unique = new HashSet<>(employees);

        System.out.println("\nUnique Employees:");
        for (Employee2 e : unique) {
            System.out.println(e);
        }
    }
}


