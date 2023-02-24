import java.util.Collections;
import java.util.Arrays;

public class InbuiltSort
{
        public static void main(String args[])
        {
            Integer arr[]={2,4,3,5,1};
            Arrays.sort(arr,Collections.reverseOrder());
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }
}

