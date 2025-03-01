package practice_book;

public class Main {
    public static void main(String[] args) {
        Book harry = new Book("Гарри Поттер", "Джоан Роулинг");

        harry.printInfo();

        harry.setAuthor("Я");
        harry.printInfo();
    }
}
