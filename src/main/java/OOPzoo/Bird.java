package OOPzoo;

public class Bird extends Animal {
    public Bird() {
        this.name = "Bird";
        this.age = 2;
    }

    @Override
    void speak() {
        System.out.println("Птица чирикает");
    }

    @Override
    void move() {
        System.out.println("Птица летает");
    }

}