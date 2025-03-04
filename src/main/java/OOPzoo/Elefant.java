package OOPzoo;

public class Elefant extends Animal {
    public Elefant() {
        this.name = "Elefant";
        this.age = 5;
    }

    @Override
    void speak() {
        System.out.println("Слон трубит");
    }

    @Override
    void move() {
        System.out.println("Слон ходит");
    }

}
