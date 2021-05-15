public class bat_Test {
    public static void main(String[] args){
        Bat Ferrell = new Bat();
        for (int i = 0; i < 3; i++) {
            Ferrell.attackTown();
        }
        for (int i = 0; i < 2; i++) {
            Ferrell.eatHumans();
        }
        for (int i = 0; i < 2; i++) {
            Ferrell.fly();
        }
        Ferrell.displayEnergy();
    }
}
