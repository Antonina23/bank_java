package OOPMuseum;

public class Main {
    public static void main(String[] args) {
        Keeper keeper = new Keeper();
        Exponat sculpture = new Sculpture("Скульптура один", 780);
        Exponat manuscripts = new Manuscripts("Манускрипты один", 200);

        keeper.print(sculpture);
        keeper.print(manuscripts);
        keeper.takeCare(sculpture);
        keeper.takeCare(manuscripts);

    }
}
