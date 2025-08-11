package AdmisssionPrs;

public class MedicalStudent extends Student {
    private int marks;

    public MedicalStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }
    public String getGrade() {
        return marks >= 80 ? "Excellent" :
               marks >= 65 ? "Good" :
               marks >= 50 ? "Average" :
               "Fail";
    }
}
