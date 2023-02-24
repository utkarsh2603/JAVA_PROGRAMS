import java.util.*;

public class BinaryToDecimal
{
    public static void binTodec(int binary_number)
    {
        int pow=0;
        int dec=0;

        while(binary_number>0) {
            int last_digit = binary_number % 10;
            dec = dec + (last_digit * ((int) Math.pow(2, pow)));
            pow++;
            binary_number=binary_number/10;
        }
            System.out.println(dec);

    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter bianry number: ");
        int binary_number=sc.nextInt();

        binTodec(binary_number);
    }
}
