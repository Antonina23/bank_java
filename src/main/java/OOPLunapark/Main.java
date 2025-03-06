package OOPLunapark;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Attractions rollercoaster = new RollerCoaster();
        Attractions carousel = new Carousel();

        admin.print(rollercoaster);
        admin.print(carousel);
        admin.care(rollercoaster);
        admin.care(carousel);

    }
}
