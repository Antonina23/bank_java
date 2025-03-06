package OOPLunapark;

public class Admin {
    public void print(Attractions attractions) {
        System.out.println("Аттракцион: " + attractions.getName() + ", возраст: " + attractions.getAge());
    }

    public void care(Attractions attractions) {
        attractions.service();
    }
}
