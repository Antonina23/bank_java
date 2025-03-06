package OOPMuseum;

public class Main {
    public static void main(String[] args) {
        Keeper keeper = new Keeper();
        Exponat sculpture = new Sculpture();
        Exponat manuscripts = new Manuscripts();

        keeper.print(sculpture);
        keeper.print(manuscripts);
        keeper.takeCare(sculpture);
        keeper.takeCare(manuscripts);

    }
}
