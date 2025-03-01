package person;

public class Main {
    public static void main(String[] args) {
        Person petya = new Person("Petya", "Petrov", "123-45-6789");
        Person kolya = new Person("Kolya", "Nikolaev", "123-45-6790");
        Person vanya = new Person("Vanya", "Ivanov", "123-45-6791");

        petya.printPersonInfo();

        petya.setFirstName("Fedor");
        petya.setLastName("Fedorov");

        petya.printPersonInfo();
        kolya.printPersonInfo();
        vanya.printPersonInfo();
    }
}
