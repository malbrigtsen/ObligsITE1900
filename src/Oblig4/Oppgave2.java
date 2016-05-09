package Oblig4;

import java.util.Scanner;

public class Oppgave2 {
    private static int numberOfRecursiveCalls = 0;
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int numberOfDisks = input.nextInt();
        System.out.println("The moves are: ");
        moveDisks(numberOfDisks, 'A', 'B', 'C');
        System.out.println("The number of moves are: " + numberOfMoves(numberOfDisks));
        System.out.println(" ");
        System.out.println("Number of Recursion calls " + numberOfRecursiveCalls);
    }
    public static void moveDisks(int numberOfDisks, char fromTower, char toTower, char auxTower) {
        if (numberOfDisks == 1){
            System.out.println("Move disk " + numberOfDisks + " from " + fromTower + " to " + toTower);
        }
        else {
            moveDisks(numberOfDisks - 1, fromTower, auxTower, toTower);
            numberOfRecursiveCalls++;
            System.out.println("Move disk " + numberOfDisks + " from " + fromTower + " to " + toTower);
            moveDisks(numberOfDisks - 1, auxTower, toTower, fromTower);
            numberOfRecursiveCalls++;
        }
    }
    public static int numberOfMoves(int numberOfDisks){
        if(numberOfDisks == 0)
            return 0;
        else if (numberOfDisks == 1)
            return 1;
        else
            return (int) Math.pow(2, numberOfDisks) - 1;
    }
}
