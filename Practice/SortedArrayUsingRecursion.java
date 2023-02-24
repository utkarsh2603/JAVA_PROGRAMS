public class SortedArrayUsingRecursion
{
    public static boolean sortedArray(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return sortedArray(arr,i+1);


    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5,6,7,8};
        System.out.println(sortedArray(array,0));

    }
}
