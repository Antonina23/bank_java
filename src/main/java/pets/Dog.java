package pets;

public class Dog extends Pets{
    @Override
    public void feed(){
        System.out.println("Собака кушает сухой корм");
    }

    public void move(){
        System.out.println("Собака гуляет по парку");
    }
}
