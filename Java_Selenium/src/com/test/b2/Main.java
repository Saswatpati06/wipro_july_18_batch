package com.test.b2;

import java.util.Scanner;

//Custom Exception Class
class InvalidIdException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

 public InvalidIdException(String message) {
     super(message);
 }
}

//Student Class
class Student {
 private String name;
 private int id;

 // Method to set student data with validation
 public void setStudentDetails(String name, int id) throws InvalidIdException {
     if (id <= 0 || String.valueOf(id).length() < 4) {
         throw new InvalidIdException("Invalid ID: ID must be a positive number with at least 4 digits.");
     }
     this.name = name;
     this.id = id;
 }

 public void display() {
     System.out.println("Student Name: " + name);
     System.out.println("Student ID: " + id);
 }
}

//Main Class
public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Student student = new Student();

     System.out.print("Enter student name: ");
     String name = scanner.nextLine();

     System.out.print("Enter student ID: ");
     int id = scanner.nextInt();

     try {
         student.setStudentDetails(name, id);
         System.out.println("\nStudent Details:");
         student.display();
     } catch (InvalidIdException e) {
         System.out.println("Error: " + e.getMessage());
     }

}
 
}