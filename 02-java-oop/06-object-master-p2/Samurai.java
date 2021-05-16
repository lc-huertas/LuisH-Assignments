public class Samurai extends Human {
    public Samurai(){
        this.setHealth(200);
    }
    public void deathBlow(Human target){
        target.setHealth(0);
        this.setHealth(this.getHealth()/2);
    }
    public void meditate(){
        this.setHealth(200);
    }
}
