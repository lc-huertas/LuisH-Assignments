import java.lang.Math;

public class pythagorean_Theorem {
    public static void main(String[] args){
        double legA = 3;
        double legB = 4;
        double legC =calculateHypotenuse(legA,legB);
        System.out.println("The length of the hypotenuse is "+legC);

    }

    public static double calculateHypotenuse(double A, double B){
        double C = Math.sqrt((Math.pow(A, 2))+(Math.pow(B, 2)));
        return C;
    }
}
