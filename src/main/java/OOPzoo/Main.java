package OOPzoo;

public class Main {
    public static void main(String[] args) {
        Animal elefant = new Elefant();
        Animal bird = new Bird();

        Zoopark zoopark = new Zoopark();

        zoopark.print(elefant);
        zoopark.showthem(elefant);
    }

}
