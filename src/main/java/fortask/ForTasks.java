package fortask;

public class ForTasks {
    public void allNumbers() {
        for(int i=1; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public int sumNumbers(int x) {
        int summa = 0;

        for(int i=1; i <= x; i++) {
            summa = summa+i;
        }
        return summa;
    }

    public void mnogoNumbers(int numb) {
        for(int i=1; i <=10; i++) {
            System.out.println(numb * i);
        }
    }
}
