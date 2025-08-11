package AdmisssionPrs;

public class EngineeringStudent extends Student {
    private int marks;

    public EngineeringStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }
    public String getGrade() {
        return marks >= 75 ? "Distinction" :
               marks >= 60 ? "First Class" :
               marks >= 50 ? "Second Class" :
               "Fail";
    }
}
