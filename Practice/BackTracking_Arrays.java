public class BackTracking_Arrays
{
    public static void changeArrays(int array[],int index,int value)
    {
        //base condition
        if(index==array.length)
        {
            return;
        }

        //recursion
        array[index]=value;
        changeArrays(array,index+1,value+1);
        array[index]=array[index]-2;


    }
    public static void main(String args[])
    {
        int array[]=new int[5];
        changeArrays(array,0,1);

        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }


    }
}
