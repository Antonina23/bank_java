package OOPMuseum;

public class Keeper {
    public void print(Exponat exponat) {
        System.out.println("Экспонат: " + exponat.getName() + ", год создания: " + exponat.getYear());
    }

    public void takeCare(Exponat exponat) {
        exponat.care();
    }
}
