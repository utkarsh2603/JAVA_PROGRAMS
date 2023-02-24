import java.sql.SQLOutput;
import java.util.*;

public class PrimeInRange
{
    public static boolean checkPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(checkPrime(i))
            {
                System.out.print(i);
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        primeInRange(number);


    }
}