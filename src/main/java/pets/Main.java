package pets;

public class Main {
    public static void main(String[] args) {
        Pets dog = new Dog("Собака Джесси", 1);
        Pets cat = new Cat("Кошка Муся", 2);
        Pets dog2 = new Dog("Собака Том", 3);
        Pets cat2 = new Cat("Кошка Джерри", 4);
        Owner owner = new Owner();

        owner.add(dog);
        owner.add(cat);
        owner.control(dog);
        owner.control(cat);
        owner.add(dog2);
        owner.add(cat2);
        owner.control(dog2);
        owner.control(cat2);

    }
}
