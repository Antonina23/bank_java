package OOPBotanic;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Plant orchidea = new Orchidea();
        Plant cactus = new Cactus();

        admin.addPlant(orchidea);
        admin.addPlant(cactus);
        admin.control(orchidea);
        admin.control(cactus);
    }
}
