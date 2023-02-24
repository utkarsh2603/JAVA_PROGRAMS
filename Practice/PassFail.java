import java.util.*;

public class PassFail
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int marks=sc.nextInt();
        //int marks=40;
        String grade=(marks>33)? "Pass":"Fail";

        System.out.println(grade);
    }
}
