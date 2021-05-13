public class gorilla_Test {
    public static void main(String[] args){
        gorilla furiousGeorge = new gorilla();
        for (int i = 0; i < 3; i++) {
            furiousGeorge.throwSomething();   
        }
        for (int i = 0; i < 2; i++) {
            furiousGeorge.eatBanana();    
        }
        furiousGeorge.climb();
        furiousGeorge.displayEnergy();
    }
}
