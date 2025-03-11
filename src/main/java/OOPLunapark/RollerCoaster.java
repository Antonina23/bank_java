package OOPLunapark;

public class RollerCoaster extends Attractions {
    public RollerCoaster(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    void service() {
        System.out.println(getName() + " требуют регулярной проверки безопасности");
    }
}
