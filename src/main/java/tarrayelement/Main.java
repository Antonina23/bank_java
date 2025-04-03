package tarrayelement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "James", "Bond");
        printList(names);

        List<Integer> numberstwo = List.of(1, 2, 3);
        printList(numberstwo);

    }

    public static <T> void printList(List<T> list) {
        for(T element : list) {
            System.out.println(element);
        }

    }
}
