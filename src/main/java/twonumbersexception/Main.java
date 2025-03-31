package twonumbersexception;

public class Main {
    public static void main(String[] args) {
      int x;
      int y;

      try {
          delenie(4,0);
      } catch (ArithmeticException e) {
          System.err.println("Делить на ноль нельзя!");
      }
    }

    public static void delenie(int x, int y) {
        if(y == 0) {
            throw new ArithmeticException();
        }
        System.out.println(x/y);
    }

}
