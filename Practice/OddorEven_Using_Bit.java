import java.util.*;

public class OddorEven_Using_Bit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. in Decimal number System: ");
        int n=sc.nextInt();
        String binary=Integer. toBinaryString(n);
        System.out.println("The entered decimal number in Binary is: "+binary);
        int bitmask=1;
        if((n & bitmask)==0)
        {
            System.out.println("EVEN");
        }
        else
            System.out.println("ODD");
    }
}
