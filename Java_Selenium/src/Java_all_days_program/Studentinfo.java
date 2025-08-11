package Java_all_days_program;

public class Studentinfo {
	    String name;
	    int age;
	    String course;
	    String collage;
	    void displayInfo() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Course: " + course);
	        System.out.println("Collage: " + collage);
	    }

	    public static void main(String[] args) {
	        Studentinfo student1 = new Studentinfo();
	        
	        student1.name = "Saswat Pati";
	        student1.age = 23;
	        student1.course = "Computer Science";
	        student1.collage = "ITER";
	        student1.displayInfo();
	    }
	}
	