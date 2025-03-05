package pets;

public class Cat extends Pets{
    @Override
    public void feed(){
        System.out.println("Кошка есть влажный корм");
    }
    public void move(){
        System.out.println("Кошка играет");
    }
}
