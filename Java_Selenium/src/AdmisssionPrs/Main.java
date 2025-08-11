package AdmisssionPrs;

public class Main {
    public static void main(String[] args) {
        Student eng = new EngineeringStudent("Saswat", 101, 72);
        Student med = new MedicalStudent("Liku", 202, 88);

        System.out.println(eng.name + " (c++): " + eng.getGrade());
        System.out.println(med.name + " (Java): " + med.getGrade());
    }
}