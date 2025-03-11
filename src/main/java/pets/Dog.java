package pets;

public class Dog extends Pets{
    public Dog(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public void feed(){
        System.out.println(getName() + " кушает сухой корм");
    }

    public void move(){
        System.out.println(getName() + " гуляет по парку");
    }
}
