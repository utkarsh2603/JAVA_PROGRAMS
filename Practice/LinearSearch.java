
import java.util.*;

public class LinearSearch
{
    public static int search(int array[],int key)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key to find the index of that key: ");
        int key=sc.nextInt();
        int marks[]={12,14,17,27,32,64,98};

        int index =search(marks,key);

        if(index == -1) {
            System.out.println("INDEX NOT FOUND");
        }
            else
            {
            System.out.println(index);
        }
        }

    }

