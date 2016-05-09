package Oblig1.Oppgave3;

import java.util.*;
public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] anArray = new int[100];
        Random rand = new Random();

        for(int i = 0; i < 100; i++) {
            anArray[i] = rand.nextInt();
        }
        System.out.println("Enter an index value of the array: ");

        try {
            int number = input.nextInt();
            number -= 1;
            System.out.println("The corresponding elemnt value is: " + anArray[number]);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Out of bounds");
            input.close();
        }
        catch (InputMismatchException e){

        }

    }
}