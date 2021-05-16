public class character_Test {
public static void main(String[] args){     
        Wizard Luis = new Wizard();
        Ninja Gabriel =  new Ninja();
        Samurai Steve = new Samurai();
        System.out.println("Luis - Wizard health: "+ Luis.getHealth());
        System.out.println("Gabriel - Ninja stealth: "+ Gabriel.getStealth());
        System.out.println("Steve - Samurai health: " + Steve.getHealth());
        System.out.println("Gabriel - Ninja stealth: "+ Gabriel.getHealth());
        System.out.println("Steve does a deathblow to Gabriel.");
        Steve.deathBlow(Gabriel);
        System.out.println("Gabriel - Ninja stealth: "+ Gabriel.getHealth());
        System.out.println("Steve - Samurai health: " + Steve.getHealth());
        for (int i = 0; i < 8; i++) {
            Luis.heal(Gabriel);
            System.out.println("Luis heals Gabriel: "+ Gabriel.getHealth()+" is Gabriel's health.");       
        }
    }
}
