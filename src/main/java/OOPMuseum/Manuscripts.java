package OOPMuseum;

public class Manuscripts extends Exponat {
    public Manuscripts(String name, int year) {
        setName("Манускрипт: " + name);
        setYear(year);
    }

    @Override
    void care() {
        System.out.println(getName() + "требуют контролируемой влажности и температуры");
    }
}
