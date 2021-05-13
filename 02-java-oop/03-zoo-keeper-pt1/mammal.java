public class mammal {
    private int energyLevel;

    public int displayEnergy(){
        System.out.println("energy: "+this.energyLevel);
        return this.energyLevel;
    }
    public void setEnergy(int energy){
        this.energyLevel=energy;
    }
    public mammal(){
        this.energyLevel=100;
    }
}
