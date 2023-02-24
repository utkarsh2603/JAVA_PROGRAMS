public class PracticeJava_17th_dec
{
    public static void selectionSort(int array[])
    {
        for(int i=0;i<array.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[minpos]<array[j])
                {
                    minpos=j;
                }
            }
            int temp=array[minpos];
            array[minpos]=array[i];
            array[i]=temp;
        }
    }
    public static void main(String args[])
    {
        int array[]={4,6,7,2,3,9,1,5,8};
        selectionSort(array);

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}

