package whilell;

public class WhileTasks {
    public int facto(int x) {
        int factorial = 1;
        while (x > 0) {
            factorial = x * factorial;
            x = x - 1;
        }
        return factorial;
    }

    public void chetno(int n) {
        int i = 1;
        while (i < n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void countdown(int pe) {
        if(pe <=0) {
            System.out.println("Пожалуйста, введите положительное число");
        }
        while (pe > 0) {
            System.out.println(pe);
            pe = pe-1;
        }
    }
}
