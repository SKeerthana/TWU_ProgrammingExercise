package TriangleExercises;

import java.util.Scanner;

/**
 * Created by keerthas on 19/08/15.
 */
public class HorizontalLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int n = sc.nextInt();
        drawHorizontalLine(n);
    }

    private static void drawHorizontalLine(int n) {
        for(int i=0;i<n;i++)
            System.out.print("*");
    }
}
