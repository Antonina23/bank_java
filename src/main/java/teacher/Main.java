package teacher;

public class Main {
    public static void main(String[] args) {
        Teacher first = new Teacher("Анна Петровна", "Математика");

        first.print();

        first.setSubject("Химия");
        first.print();
    }
}
