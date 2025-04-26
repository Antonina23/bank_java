package testevenoddnumbers;

public class IsEven {
    public static void main(String[] args) {
        System.out.println(isEven(1));
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
