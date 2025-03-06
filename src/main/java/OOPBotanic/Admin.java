package OOPBotanic;

public class Admin {
    private Plant plant;

    public Admin() {
        this.plant = null;
    }

    public void addPlant(Plant plant) {
        this.plant = plant;
    }

    public void control(Plant plant) {
        plant.careOf();
    }

}
