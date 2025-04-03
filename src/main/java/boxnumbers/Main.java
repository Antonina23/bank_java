package boxnumbers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> newlistnumber = List.of(1,2,3,4);
        BoxNumber<Integer> intBox = new BoxNumber<>(newlistnumber);
        System.out.println(intBox.getSum());

    }

}
