package DiamondExcercises;

import java.util.Scanner;

/**
 * Created by keerthas on 19/08/15.
 */
public class IsoscelesTriangle {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int n = sc.nextInt();
        drawIsoscelesTriangle(n);
    }

    public static void drawIsoscelesTriangle(int n){

        int numberOfSpaces;
        int numAsterisk;

        for(int i = 0; i < n; i++) {
            numberOfSpaces = numberOfSpaces(i, n);
            numAsterisk = numberOfAsterisk(i);
            printSpaces(numberOfSpaces);
            printAsterisks(numAsterisk);
            System.out.println();
        }
    }

    public static int numberOfAsterisk(int i){
        return 2 * i + 1;
    }

    public static int numberOfSpaces(int i, int n){
        return n - i - 1;
    }

    public static void printSpaces(int numSpaces){
        for(int i=1; i <= numSpaces; i++){
            System.out.print(" ");
        }
    }

    public static void printAsterisks(int numAsterisk){
        for(int i=1; i <= numAsterisk; i++){
            System.out.print("*");
        }

    }
}
