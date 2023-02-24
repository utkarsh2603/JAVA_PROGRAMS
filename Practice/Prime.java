
import java.util.*;

public class Prime
{
    public static void checkPrime(int n)
    {
        if(n==2)
        {
            System.out.println("The given no. is Prime");
        }
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)

                System.out.println("The given no. is not Prime");
            else
                    System.out.println("The given no. is Prime");
            break;


    }
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int number = sc.nextInt();

    checkPrime(number);


}
}