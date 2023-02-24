package Practice;

import java.util.*;
public class PrimeOrNotPrime
{
    public static void main(String args[])
    {
        int div=2;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(div<num)
        {
            if(num%div==0)
            {
                System.out.println("Not Prime");


            }
            else
            {
                System.out.println("Prime");
            }
            div=div+1;
        }


    }
}
