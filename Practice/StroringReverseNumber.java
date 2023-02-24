import java.util.*;

public class StroringReverseNumber
{
        public static void main(String [] args)
        {
            Scanner sc= new Scanner(System.in);
            long n =sc.nextLong();
        /* int i=0;
        int sum=0;

        while(i<=n)
        {
            sum=sum+i;
           i++;
        }
        System.out.println("The sum of first n number is: "+ sum);

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)

            System.out.print("*");
        }
        System.out.println();
        int n;
        while(n>0)
        {
        int n =10599;
        int reverse=n%10;
        System.out.println(reverse);
        n=n/10;
        }
        System.out.println(reverse); */
            long rev=0;
            while(n>0)
            {
                long lastdigit=n%10;
                rev=(rev*10)+lastdigit;
                n=n/10;
            }
            System.out.println("The reverse of number n is: "+rev);


        }
    }

