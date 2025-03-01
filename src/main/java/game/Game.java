package game;

public class Game {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    Game(String someGameName, int someCurrentPlayers) {
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    public static void setMaxPlayers(int newMax) {
        maxPlayers = newMax;
    }

    public void addPlayer() {
        if (currentPlayers < 5) {
            currentPlayers++;
        }
    }

    public void printGameStatus() {
        System.out.println("Название: " + this.gameName + ", игроки: " + this.currentPlayers + ", макс: " + maxPlayers);
    }
}
