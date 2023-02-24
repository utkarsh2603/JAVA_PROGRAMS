import java.util.*;
import java.io.*;

public class BinomialCoefficient
{
    public static int factorial(int n)
    {
        int fact=1;
        while(n>0)
        {
            fact=fact*(n);
            n--;

        }
        return fact;
    }

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[43m";

    //public static final String ANSI_YELLOW = "\u001B[35m";

    public static int calculation()
    {
        Scanner sc=new Scanner(System.in);
        System. out. println(ANSI_RED  + "The formula of Binomial Distribution is: " + ANSI_RESET);
       // System.out.println("The formula of Binomial Distribution is: ");
        System.out.println("n!/r!*(n-r)!");
        System.out.println("The value of n is: ");
        int n=sc.nextInt();
        System.out.println("The value of r is: ");
        int r=sc.nextInt();

        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nr=factorial(n-r);

        int binomialCoefficient=(fact_n/(fact_r*fact_nr));
        return binomialCoefficient;
    }


    public static void main(String args[])
    {
        long binomial=calculation();
        System.out.println("The binomial coefficient is : "+binomial);
    }
}