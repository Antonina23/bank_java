package OOPzoo;

public class Zoopark {

        public void showthem(Animal animal) {
            animal.move();
            animal.speak();
        }

        public void print(Animal animal) {
            System.out.println("Животное " + animal.getName());
            System.out.println("Возраст " + animal.getAge());
        }

    }

