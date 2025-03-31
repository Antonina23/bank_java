package boxgeneric;

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Element");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(6);
        System.out.println(boxInteger.getElement());

    }
}
