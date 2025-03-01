package practice_1;

public class Student {
    int age;
    String name;

    public Student(int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}

class Main {
        public static void main(String[] args) {
        Student petya = new Student(18, "Petya");
        System.out.println(petya.getAge());

        petya.setAge(20);
        System.out.println(petya.getAge());
        }

    }

