public class gorilla extends mammal {
    public void throwSomething(){
        int energy = this.displayEnergy();
            if((energy-5)>0){
                System.out.println("Gorilla throws something!");
                this.setEnergy(energy-5);
            } else {
                System.out.println("Gorilla is too tired to throw something");
            }
    }
    public void climb(){
        int energy = this.displayEnergy();
            if((energy-10)>0){
                System.out.println("Gorilla is climbing!");
                this.setEnergy(energy-5);
            } else {
                System.out.println("Gorilla is too tired to climb.");
            }
    }
    public void eatBanana(){
        int energy = this.displayEnergy();
            if((energy+10)>100){
                this.setEnergy(100);
            } else {
                this.setEnergy(energy+10);
                System.out.println("Gorilla eats a banana.");
            }
    }
}
