package OOPMuseum;

public class Sculpture extends Exponat {
    public Sculpture(String name, int year) {
        setName("Скульптура: " + name);
        setYear(year);
    }

    @Override
    void care() {
        System.out.println(getName() + " нуждается в регулярной реставрации");
    }
}
