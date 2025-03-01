package game;

public class Main {
    public static void main(String[] args) {
        Game one = new Game("One", 2);
        Game two = new Game("Two", 3);

        Game.maxPlayers = 5;

        one.addPlayer();
        two.addPlayer();

        one.printGameStatus();
        two.printGameStatus();

    }
}
