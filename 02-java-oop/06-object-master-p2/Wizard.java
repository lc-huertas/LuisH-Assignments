public class Wizard extends Human {
    public Wizard(){
        this.setHealth(50);
        this.setIntellect(8);
    }
    public void heal(Human target){
        target.setHealth(target.getHealth()+this.getIntellect());
    }
    public void fireball(Human target){
        target.setHealth(target.getHealth()-3*this.getIntellect());
    }
}
