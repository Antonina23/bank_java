package tasks;

public class Tasks {
    public String number(int x) {
        String numberCheck = "";
        if(x > 0) {
            numberCheck = "Число положительное";
        }
        if (x < 0) {
            numberCheck = "Число отрицательное";
        }
        if (x == 0) {
            numberCheck = "Число равно 0";
        }
        return numberCheck;
    }

    public int twice(int y, int z) {
        if(y > z) {
            return y;
        }
        else {
            return z;
        }
    }

    public String star(int w) {
        String starCheck = "";
        if(w == 5) {
            starCheck = "Отлично";
        }
        else if (w == 4) {
            starCheck = "Хорошо";
        }
        else if (w == 3) {
            starCheck = "Удовлетворительно";
        }
        else if (w == 2 || w == 1) {
            starCheck = "Неудовлетворительно";
        }
        else {
            starCheck = "Такой оценки не существует";
        }
        return starCheck;
    }


}
