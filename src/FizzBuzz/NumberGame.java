package FizzBuzz;

/**
 * Created by keerthas on 19/08/15.
 */
public class NumberGame {

    public static void main(String [] args)
    {
        FizzBuzz(100);
    }

    public static void FizzBuzz(int n){

        for(int i = 1; i <= n ; i++)
        {
            if(i%3 == 0 || i%5 == 0){
                if(i%3==0)
                    System.out.print("Fizz");
                if(i%5==0)
                    System.out.print("Buzz");
            }
            else
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
