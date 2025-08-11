package collage;

public class Student {
	    // Private data members
	    private String studentName;
	    private int studentId;
	    private String studentDepartment;

	    // Constructor
	    public Student(String name, int id, String department) {
	        studentName = name;
	        studentId = id;
	        studentDepartment = department;
	    }

	    // Public method to display student info
	    public void displayStudentInfo() {
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Student Department: " + studentDepartment);
	    }

}
