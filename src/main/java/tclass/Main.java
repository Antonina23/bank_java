package tclass;

public class Main {
    public static void main(String[] args) {
        Storaget<String> newStorage = new Storaget<>();
        newStorage.setElement("Hello");
        System.out.println(newStorage.getElement());

        Storaget<Integer> newIntegerStorage = new Storaget<>();
        newIntegerStorage.setElement(5);
        System.out.println(newIntegerStorage.getElement());
    }
}
