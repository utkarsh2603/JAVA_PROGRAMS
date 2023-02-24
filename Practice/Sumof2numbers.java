import java.util.*;

public class Sumof2numbers
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int a= sc.nextInt();
        System.out.println("Enter second number:- ");
        int b= sc.nextInt();

        int sum= a+b*a*b;

        System.out.println("The sum of given two number is: " + sum);

    }
}
