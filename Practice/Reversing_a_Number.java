package Practice;

import java.util.Scanner;

public class Reversing_a_Number
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        while(number>0)
        {
            int last_digit=number%10;
            System.out.print(last_digit);
            number=number/10;
        }
    }
}
