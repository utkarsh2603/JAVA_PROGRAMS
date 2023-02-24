public class FirstOcuurence
{
    public static int firstOccurence(int arr[],int key, int i)
    {
        if(i==arr.length-1)
        {
            return -1;
        }
        if(key==arr[i])
        {
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5,6,7,8};
        int key=5;
        int index=0;

        System.out.println(firstOccurence(array,key,index));
    }


}
