package AdmisssionPrs;

public abstract class Student {
    protected String name;
    protected int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public abstract String getGrade();
}
