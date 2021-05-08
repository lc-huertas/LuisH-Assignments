import java.util.ArrayList;
import java.util.Arrays;

public class basicJava{
    public static void main(String[] aStrings){
        CountAll();
        CountAllOdd();
        SumAll();

        int[] NumArray = {1,32,14,415,50};
        CountArray(NumArray);     
        findMax(NumArray);  
        findAvg(NumArray); 
        oddNumList(NumArray);
        int y_val = 15;
        greaterThanY(NumArray,y_val);
        squareArray(NumArray);
        int[] NumArray2 = {1,-13,-20,4,8,18,22,-36};
        noNegatives(NumArray2);
        int Results [];
        Results=statAnalysis(NumArray2);
        int Results2 [];
        Results2=shiftForward(NumArray2);
    }
    public static void CountAll(){
        System.out.println("Count all numbers from 0 to 225");
        for (int i = 1; i <= 225; i++) {
            System.out.println(i);
        }
        System.out.println("");
    }
    public static void CountAllOdd(){
        System.out.println("Count all odd numbers from 0 to 225");
        for (int i = 1; i <= 225; i++) {
            if (i%2==0){

            } else {
                System.out.println(i);
            }
        }
        System.out.println("");
    }
    public static void SumAll(){
        System.out.println("Sum all numbers from 0 to 225");
        int sum = 0;
        for (int i = 1; i <= 225; i++) {
            sum=sum+i;
            System.out.println("iteration: "+i+" "+"sum: "+sum);
        }
        System.out.println("");
    }
    public static void CountArray(int NumArray[]){
        System.out.println("Count all numbers in an array.");
        for (int i = 0; i < NumArray.length; i++) {
            System.out.println("index: "+i+" value: "+NumArray[i]);
        }
        System.out.println("");
    }
    public static void findMax(int NumArray[]){
        int max = NumArray[0];
        for (int i = 1; i < NumArray.length; i++) {
            if(NumArray[i]>max){
                max=NumArray[i];
            }
        }
        System.out.println("Max value in array: "+max);
    }
    public static void findAvg(int NumArray[]){
        int sum = 0;
        for (int i = 0; i < NumArray.length; i++) {
            sum=sum+NumArray[i];
        }
        double average = sum/NumArray.length;
        System.out.println("Average value in array: "+average);
    }
    public static void oddNumList(int NumArray[]){
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        for (int j = 0; j < NumArray.length; j++) {
            if(NumArray[j]%2==0){

            } else {
                oddList.add(NumArray[j]);
            }
        }       
        System.out.println("Create an Array list of only odd numbers found in an array.");
        for (Integer odd_value : oddList) {
            System.out.println("Odd ArrayList Value: "+odd_value);
        }
    }
    public static void greaterThanY(int numList[],int y_value){
        int count =0;
        for (int i : numList) {
            if(i > y_value){
                count++;
            }
        }
        System.out.println("Count the number of values in an array that are greater than " + y_value);
        System.out.println("There are "+ count + " values greater than "+ y_value);
    }
    public static void squareArray(int numList[]){
        System.out.println("Square each value of the given array: "+ Arrays.toString(numList));
        for (int i = 0; i < numList.length; i++) {
            numList[i]=numList[i]*numList[i];
        }
        System.out.println("Here's the squared array: "+ Arrays.toString(numList));
    }
    public static void noNegatives(int numList[]){
        System.out.println("Remove any negative values from the given array: "+Arrays.toString(numList));
        for (int i = 0; i < numList.length; i++) {
            if(numList[i]<0){
                numList[i]=0;
            }
        }
        System.out.print(Arrays.toString(numList));
    }
    public static int[] statAnalysis(int numList[]){
        System.out.println("");
        System.out.println("Produce an array containing the max,min & avg from the array provided: "+Arrays.toString(numList));
        int[] results = {0,0,0}; // max,min,avg
        int max = numList[0];
        int min = numList[0];
        int avg = 0;
        for (int i = 0; i < numList.length; i++) {
            avg=avg+numList[i];
            if(numList[i]>max){
                max=numList[i];
            }
            if(numList[i]<min){
                min=numList[i];
            }            
        }
        results[0]=max;
        results[1]=min;
        results[2]=avg/numList.length;
        System.out.println(Arrays.toString(results));
        return results;
    }
    public static int[] shiftForward(int numList[]){
        System.out.println("Shift each value forward in the array: "+Arrays.toString(numList));
        for (int j = 1; j < numList.length; j++) {
            numList[j-1]=numList[j];
        }
        numList[numList.length-1]=0;
        System.out.println("Result: "+Arrays.toString(numList));
        return numList;
    }
}