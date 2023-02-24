import java.util.*;

public class Swap
{
    public static void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        swap(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
