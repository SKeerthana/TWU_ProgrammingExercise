package PrimeFactorsExercise;

import java.util.Scanner;

/**
 * Created by keerthas on 19/08/15.
 */
public class PrimeFactor {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int n = sc.nextInt();
        generate(n);
    }

    private static void generate(int n) {

        for (int i = 2; i*i <= n; i++) {

            if(n % i == 0)
                System.out.print( i + " ");

            while (n % i == 0) {
                n = n / i;
            }
        }

        if(n>1)
            System.out.println( n );
    }

}
