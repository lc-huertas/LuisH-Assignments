public class Human {
    private double health = 100;
    private int strength = 3;
    private int stealth =3;
    private int intelligence = 3;
    
    // get ==================================================
    public double getHealth(){
        return this.health;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getStealth(){
        return this.stealth;
    }
    public int getIntellect(){
        return this.intelligence;
    }
    // set ==================================================
    public void setHealth(double hp){
        this.health = hp;
    }
    public void setStrength(int str){
        this.strength = str;
    }
    public void setStealth(int stl){
        this.stealth = stl;
    }
    public void setIntellect(int intelli){
        this.intelligence = intelli;
    }
    // actions ==================================================
    public void attack(Human enemy){
        enemy.setHealth(enemy.getHealth()-this.strength);
    }
}
