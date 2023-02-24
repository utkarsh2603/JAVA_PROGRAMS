public class OptimisedBubbleSort
{
    public static void sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped==false)
                break;
            }

        }

    public static void main(String args[])
    {
        int array[]={2,5,4,7,8};
        sort(array);

        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]+" ");
        }
    }
}
