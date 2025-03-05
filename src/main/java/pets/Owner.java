package pets;

public class Owner {
    private Pets pets;

    public Owner(){
        this.pets = null;
    }
    public void add(Pets pets){
        this.pets = pets;
    }

    public void control(Pets pets){
        pets.feed();
        pets.move();
    }

}
