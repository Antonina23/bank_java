package OOPBotanic;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Plant orchidea = new Orchidea("Первая орхидея ");
        Plant cactus = new Cactus("Первый кактус ");
        Plant orchidea2 = new Orchidea("Вторая орхидея ");
        Plant cactus2 = new Cactus("Второй кактус ");

        admin.addPlant(orchidea);
        admin.addPlant(cactus);
        admin.control(orchidea);
        admin.control(cactus);
        admin.addPlant(orchidea2);
        admin.addPlant(cactus2);
        admin.control(orchidea2);
        admin.control(cactus2);
    }
}
