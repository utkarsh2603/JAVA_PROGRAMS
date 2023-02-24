import javax.swing.*;
import java.util.*;

public class StringPalindrome
{
    public static void palindrome(String word)
    {

        for(int i=1;i<word.length()/2;i++)
        {
            int n=word.length();
            if(word.charAt(i)!=word.charAt(n-1-i)) {
                System.out.println("False");
            }
                else
                System.out.println("Ture");
            }
        }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word=sc.next();

        palindrome(word);
    }
}
