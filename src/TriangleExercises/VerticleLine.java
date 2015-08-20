package TriangleExercises;

import java.util.Scanner;

/**
 * Created by keerthas on 19/08/15.
 */
public class VerticleLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int n = sc.nextInt();
        drawVerticleLine(n);
    }

    private static void drawVerticleLine(int n) {
        for(int i=0;i<n;i++)
            System.out.println("*");
    }
}
