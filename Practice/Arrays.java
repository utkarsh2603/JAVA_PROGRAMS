import java.util.*;

public class Arrays
{


    public static void main(String[] args)
    {
        int[] marks=new int[3];
        Scanner sc=new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        for(int i=0;i<=marks.length;i++)
        {
            System.out.println("Array is: "+marks[i]);
        }

    }
}