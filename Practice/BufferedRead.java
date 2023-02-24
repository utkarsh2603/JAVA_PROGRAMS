package Practice;

import java.io.BufferedReader;
//import java.io.Exception;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class BufferedRead
{
    public static void main(String args[]) throws Exception {
        System.out.println("Enter a number: ");

        InputStreamReader s1=new InputStreamReader(System.in);
        BufferedReader b1=new BufferedReader(s1);

        int n=Integer.parseInt(b1.readLine());

        System.out.println(n*n);
    }
}
