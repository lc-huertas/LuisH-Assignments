import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class javaPuzzle {
    public static void main(String[] args){
    // ------

    // Task 1
        int[] task1_numList = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> task1_results = new ArrayList<Integer>();
        task1_results=Task1(task1_numList);
    // Task 2
        ArrayList<String> task2_nameList = new ArrayList<String>();
        task2_nameList.add("Nancy");
        task2_nameList.add("Jinichi");
        task2_nameList.add("Fujibayashi");
        task2_nameList.add("Momochi");
        task2_nameList.add("Ishikawa");
        task2_nameList=Task2(task2_nameList);
    // Task 3
        Task3();
    // Task 4
        ArrayList<Integer> task4_random = new ArrayList<Integer>();
        task4_random=Task4();
    // Task 5
        ArrayList<Integer> task5_random = new ArrayList<Integer>();
        task5_random=Task5(task4_random);
    // Task 6
        Task6();
    // Task 7
        Task7();    
    }
    public static ArrayList<Integer> Task1(int numList[]){
        double sum = 0;
        ArrayList<Integer> numList2 = new ArrayList<Integer>();
        System.out.println("-- Task 1 --");
        for (int i = 0; i < numList.length; i++) {
            sum=sum+numList[i];
            System.out.println("count: "+i+" Sum: "+sum);
            if(numList[i]>10){
                numList2.add(numList[i]);
            }
        }
        System.out.println("Resulting list: "+numList2);
        System.out.println("");
        return numList2;
    }
    public static ArrayList<String> Task2(ArrayList<String> names){
        System.out.println("-- Task 2 --");
        ArrayList<String> longNames = new ArrayList<String>();
        Collections.shuffle(names);
        System.out.println("Shuffled names: "+names);
        for (String person : names) {
            if(person.length()>5){
                longNames.add(person);
            }
        }
        System.out.println("long names:"+longNames);
        System.out.println("");
        return longNames;
    }
    public static void Task3(){
        System.out.println("-- Task 3 --");
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char letter = 'a';letter <= 'z'; ++letter){
            alphabet.add(letter);
        }
        Collections.shuffle(alphabet);
        System.out.println("Last letter: "+alphabet.get(25));
        System.out.println("First letter: "+alphabet.get(0));
        if(alphabet.get(0)=='a'){
            System.out.println("First letter is a vowel!");    
        } else if(alphabet.get(0)=='e'){
            System.out.println("First letter is a vowel!");  
        } else if(alphabet.get(0)=='i'){
            System.out.println("First letter is a vowel!");  
        } else if(alphabet.get(0)=='o'){
            System.out.println("First letter is a vowel!");  
        } else if(alphabet.get(0)=='u'){
            System.out.println("First letter is a vowel!");  
        }
        System.out.println("");
    }
    public static ArrayList<Integer> Task4(){
        System.out.println("-- Task 4 --");
        ArrayList<Integer> newList = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            newList.add(r.nextInt(100-55)+55);
        }
        System.out.println("Generated list: "+newList);
        System.out.println("");
        return newList;
    }
    public static ArrayList<Integer> Task5(ArrayList<Integer> numList){
        System.out.println("-- Task 5 --");
        Collections.sort(numList);
        System.out.println("Sorted List: "+numList);
        System.out.println("Minimum: "+Collections.min(numList));
        System.out.println("Maximum: "+Collections.max(numList));
        System.out.println("");
        return numList;

    }
    public static void Task6(){
        System.out.println("-- Task 6 --");
        ArrayList<Character> alphabet = new ArrayList<Character>();
        Random r = new Random();
        String msg = "";
        for(char letter = 'a';letter <= 'z'; ++letter){
            alphabet.add(letter);
        }
        ArrayList<Character> charlist = new ArrayList<Character>();
        for (int i = 0; i < 5; i++) {
            msg = msg + alphabet.get(r.nextInt(25));
            charlist.add(alphabet.get(r.nextInt(25)));
        }
        System.out.println("Generated string: "+msg);
        System.out.println("");
    }
    public static void Task7(){
        System.out.println("-- Task 7 --");
        ArrayList<Character> alphabet = new ArrayList<Character>();
        Random r = new Random();
        for(char letter = 'a';letter <= 'z'; ++letter){
            alphabet.add(letter);
        }
        String msg = "";
        ArrayList<String> charlist = new ArrayList<String>();
        for (int j = 0; j < 10; j++) {
            msg = "";
            for (int i = 0; i < 5; i++) {
                msg = msg+alphabet.get(r.nextInt(25));
            } 
            charlist.add(msg);
        }
        System.out.println("Generated list: "+charlist);
        System.out.println("");
    }    
}
