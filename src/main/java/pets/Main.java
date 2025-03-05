package pets;

public class Main {
    public static void main(String[] args) {
        Pets dog = new Dog();
        Pets cat = new Cat();
        Owner owner = new Owner();

        owner.add(dog);
        owner.add(cat);
        owner.control(dog);
        owner.control(cat);

    }
}
