package tasks;

public class Tasks {
    public void number(int x) {
            if(x > 0) {
                System.out.println("Число положительное");
            }
            else if(x <0) {
                System.out.println("Число положительное");
            }
            else {
                System.out.println("Число ноль");
            }
    }

    public void twoNumber(int z, int y) {
        if(z > y) {
            System.out.println(z);
        }
        else {
            System.out.println(y);
        }
    }

    public void ball(int q) {
        if(q == 5) {
            System.out.println("Отлично");
        }
        else if(q == 4) {
            System.out.println("Хорошо");
        }
        else if(q == 3) {
            System.out.println("Удовлетворительно");
        }
        else if(q == 2 || q == 1){
            System.out.println("Неудовлетворительно");
        }
    }

    public void whatNumber(int w) {
        if(w % 2 == 0) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }
    }
}