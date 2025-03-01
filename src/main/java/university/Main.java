package university;

public class Main {
    public static void main(String[] args) {
        University petya = new University(01, "Petya");
        University kolya = new University(02, "Kolya");
        University vanya = new University(03, "Vanya");

        University.changeUniversityName("AF");

        petya.printStudentInfo();
        kolya.printStudentInfo();
        vanya.printStudentInfo();

    }
}
