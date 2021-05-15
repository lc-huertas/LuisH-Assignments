public class Bat extends mammal{
    public Bat(){
        this.setEnergy(300);
    }
    public void fly(){
        int energy = this.displayEnergy();
            if((energy-50)>-1){
                System.out.println("*wings flap* and the bat flies");
                this.setEnergy(energy-50);
            } else {
                System.out.println("Bat is too tired to fly.");
            }
    }
    public void attackTown(){
        int energy = this.displayEnergy();
            if((energy-100)>-1){
                System.out.println("*wings flap* and the bat attacks the town.");
                this.setEnergy(energy-100);
            } else {
                System.out.println("Bat is too tired to attack the town.");
            }
    }
    public void eatHumans(){
        int energy = this.displayEnergy();
            if((energy+25)>300){
                this.setEnergy(300);
            } else {
                this.setEnergy(energy+25);
                System.out.println("Bat eats a human.");
            }
    }
}
