import java.util.*;

public class StringReverseUsingStack
{
    public static void reverseString(String str)
    {
        Stack<Character> s=new Stack();
        int idx=0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result=new StringBuilder("");
        while ((!s.isEmpty())) {
            char curr = s.pop();
            result.append(curr);
        }
        str=result.toString();
        System.out.println(str);


    }
    public static void main(String args[])
    {
        String str="cba";
        reverseString(str);

    }
}
