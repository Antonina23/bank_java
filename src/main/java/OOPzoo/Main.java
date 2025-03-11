package OOPzoo;

public class Main {
    public static void main(String[] args) {
        Animal elefant = new Elefant("Слон", 2);
        Animal bird = new Bird("Птица", 1);
        Animal elefant2 = new Elefant("Слон 2", 5);
        Animal bird2 = new Bird("Птица 2", 4);

        Zoopark zoopark = new Zoopark();

        zoopark.addAnimal(elefant);
        zoopark.addAnimal(bird);
        zoopark.print(elefant);
        zoopark.showthem(elefant);
        zoopark.print(bird);
        zoopark.showthem(bird);
        zoopark.addAnimal(elefant2);
        zoopark.addAnimal(bird2);
        zoopark.print(elefant2);
        zoopark.showthem(elefant2);
        zoopark.print(bird2);
        zoopark.showthem(bird2);
    }

}
