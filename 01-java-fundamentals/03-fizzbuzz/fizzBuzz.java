public class fizzBuzz {
    public static void main(String[] args){
        int loopLimit = 100;
        for (int i = 1; i < loopLimit; i++) {
            System.out.println("i= " + i + " result: "+ fizzBuzz_Test(i));
        }
    }

    public static String fizzBuzz_Test(int Num){
        if(Num%15==0){
            return "FizzBuzz";
        } else if (Num%5==0){
            return "Buzz";
        } else if (Num%3==0){
            return "Fizz";
        } else{
            return Integer.toString(Num);
        }
    }
}
