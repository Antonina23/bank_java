package OOPLunapark;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Attractions rollercoaster = new RollerCoaster("Американские горки", 2);
        Attractions carousel = new Carousel("Карусель", 1);
        Attractions rollercoaster2 = new RollerCoaster("Вторые американские горки", 3);
        Attractions carousel2 = new Carousel("Вторая карусель", 2);

        admin.print(rollercoaster);
        admin.print(carousel);
        admin.care(rollercoaster);
        admin.care(carousel);
        admin.print(rollercoaster2);
        admin.print(carousel2);
        admin.care(rollercoaster2);
        admin.care(carousel2);

    }
}
