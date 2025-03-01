package library;

public class Main {
    public static void main(String[] args) {
        Library books = new Library();

        System.out.println(books.getBookTitle());
        System.out.println(books.getAuthor());
        System.out.println(books.year);
        System.out.println(books.getCategory());

        books.setBookTitle("DHDj");
        System.out.println(books.getBookTitle());

        books.setAuthor("URJRJ");
        System.out.println(books.getAuthor());

        books.setYear(1995);
        System.out.println(books.year);

        books.setCategory("fjfjf");
        System.out.println(books.getCategory());

    }
}
