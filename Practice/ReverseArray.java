public class ReverseArray
{

    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        int n=array.length;
        int i=n;
        while(i>0){

            System.out.println(array[n-1]);
            n--;
        }
    }
}
