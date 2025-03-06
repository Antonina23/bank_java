package OOPMuseum;

public class Sculpture extends Exponat {
    public Sculpture() {
        this.name = "Скульптура";
        this.year = 1200;
    }

    @Override
    void care() {
        System.out.println("Скульптура нуждается в регулярной реставрации");
    }
}
