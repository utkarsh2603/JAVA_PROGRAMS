package Practice;

import java.util.Scanner;

public class check_prime
{
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int number=sc.nextInt();

        if(number==2)
        {
            System.out.println("Prime");
        }
        else
        {
            String isPrime="true";
            for(int i=2;i<=Math.sqrt(number);i++)
            {
                if(number%i==0)
                {
                    isPrime="false";
                }

            }
            if(isPrime=="true")
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }

        }
    }
}
