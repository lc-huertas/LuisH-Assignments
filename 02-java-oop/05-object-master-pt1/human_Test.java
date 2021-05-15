public class human_Test {
    public static void main(String[] args){
        Human Luis = new Human();
        Human Gabriel = new Human();
        Human Steve = new Human();

        System.out.println(Gabriel.getHealth());
        Luis.attack(Gabriel);
        System.out.println(Gabriel.getHealth());
        Steve.attack(Gabriel);
        System.out.println(Gabriel.getHealth());
    }
}
