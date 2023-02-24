import java.util.*;
public class Get_ith_Bit {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int i=2;
        int bitmask=1<<i;
        if((number & bitmask)==0)
        {
            System.out.println("The ith bit is: "+0);
        }
        else
            System.out.println("The ith bit is: "+1);
    }
}
