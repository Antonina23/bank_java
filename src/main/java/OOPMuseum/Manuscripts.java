package OOPMuseum;

public class Manuscripts extends Exponat {
    public Manuscripts() {
        this.name = "Манускрипты";
        this.year = 950;
    }

    @Override
    void care() {
        System.out.println("Древние манускрипты требуют контролируемой влажности и температуры");
    }
}
