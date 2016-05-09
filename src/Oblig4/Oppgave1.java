package Oblig4;

import java.util.Scanner;
/**
 *
 */
public class Oppgave1 {

    public static void main(String[] args){
        System.out.println("Insert your String: ");
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        System.out.println("Reverse of the string " + myString + " is: " + reverseDisplay(myString));
        System.out.println("Number of signs is: " + counterDisplay(myString));
    }
    private static String reverseDisplay(String myString) {
        if(myString.length()<= 1)
            return myString;
        else return reverse(myString,myString.length()-1);
    }
    private static String reverse(String myString, int i) {
        if(i==0){
            return myString.charAt(0)+"";
        }
        char letter = myString.charAt(i);
        return letter + reverse(myString, i-1);
    }
    private static int counterDisplay(String myString) {
        if(myString == null || myString.equals("")){
            return 0;
        }
        else {
            return 1 + counterDisplay(myString.substring(1));
        }
    }
}