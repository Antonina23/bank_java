package pairgeneric;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setFirst("Age");
        pair.setSecond(25);
        System.out.println(pair.getFirst() + ": " + pair.getSecond());
    }
}
