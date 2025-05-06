package findabug;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;

        a = Math.round(a * 1000000) / 1000000.0;
        b = Math.round(b * 1000000) / 1000000.0;

        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
