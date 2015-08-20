package TriangleExercises;

import java.util.Scanner;

/**
 * Created by keerthas on 19/08/15.
 */
public class RightTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int n = sc.nextInt();
        drawRightTriangle(n);
    }

    private static void drawRightTriangle(int n) {
        for(int i=0;i<n;i++) {
            for (int j = i; j >= 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
