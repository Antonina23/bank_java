package boxnumbers;

import java.util.List;

public class BoxNumber<T extends Number> {
    private List<T> numberslist;

    public BoxNumber(List<T> numberslist) {
        this.numberslist = numberslist;
    }

    public double getSum() {
        double sum = 0;
        for(T number : numberslist) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
