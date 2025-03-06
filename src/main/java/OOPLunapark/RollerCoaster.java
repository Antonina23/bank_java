package OOPLunapark;

public class RollerCoaster extends Attractions {
    public RollerCoaster() {
        this.name = "RollerCoaster";
        this.age = 2;
    }

    @Override
    void service() {
        System.out.println("Американские горки требуют регулярной проверки безопасности");
    }
}
