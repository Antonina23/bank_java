package curcle;

public class Main {
    public static void main(String[] args) {
        Circle krug = new Circle(10);

        krug.print();

        krug.setRadius(100);
        krug.print();

        krug.calculateArea();
        krug.print();

        krug.calculateCircumference();
        krug.print();
    }
}
