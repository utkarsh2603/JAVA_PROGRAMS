package Practice;

import java.util.Scanner;

public class Reverse_a_given_number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rev=0;
        while(number>0) {
            int last_digit = number % 10;
            rev = (rev * 10) + last_digit;
            number = number / 10;
        }
            System.out.println(rev);

    }
}
