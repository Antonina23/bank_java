package arraygeneric;

public class ArrayPrinter<T> {
    private T[] array;

    public ArrayPrinter(T[] array) {
        this.array = array;
    }

    public void printArray() {
        for(T element : array) {
            System.out.println(element);
        }
    }
}
