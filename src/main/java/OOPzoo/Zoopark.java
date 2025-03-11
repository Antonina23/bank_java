package OOPzoo;

public class Zoopark {
        private Animal animal;

        public Zoopark() {
            this.animal = null;
        }

        public void addAnimal(Animal animal) {
            this.animal = animal;
        }

        public void showthem(Animal animal) {
            animal.move();
            animal.speak();
        }

        public void print(Animal animal) {
            System.out.println("Животное " + animal.getName());
            System.out.println("Возраст " + animal.getAge());
        }

    }

