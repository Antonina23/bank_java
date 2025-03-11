package pets;

public class Cat extends Pets{
    public Cat(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public void feed(){
        System.out.println(getName() + " ест влажный корм");
    }
    public void move(){
        System.out.println(getName() + " играет");
    }
}
