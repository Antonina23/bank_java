package OOPrestaurant;

public abstract class Dish {
    protected int infoVolume;
    protected int infoCelsium;

    public int getInfoVolume(){
        return this.infoVolume;
    }

    public int getInfoCelsium(){
        return this.infoCelsium;
    }

    public void setInfoVolume(int infoVolume) {
        this.infoVolume = infoVolume;
    }

    public void setInfoCelsium(int infoCelsium) {
        this.infoCelsium = infoCelsium;
    }
}
