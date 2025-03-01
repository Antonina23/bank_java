package student_group;

public class Main {
    public static void main(String[] args) {
        StudentGroup qa = new StudentGroup("QA", 25);

        qa.print();

        qa.setStudentCount(40);
        qa.print();
    }
}
