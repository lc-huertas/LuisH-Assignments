public class Ninja extends Human{
    public Ninja(){
        this.setStealth(10);
    }
    public void steal(Human target){
        target.setHealth(target.getHealth()-this.getStealth());
    }
}
