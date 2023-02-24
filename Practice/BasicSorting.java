public class BasicSorting
{
    public static void bubbleSort(int array[])
    {
        for(int turn=0;turn<array.length-1;turn++)
        {
            for(int j=0;j<array.length-1-turn;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int array[])
    {
        for(int i=0;i<=array.length-1;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int[] array={5,2,3,4,1};

        bubbleSort(array);
        printArray(array);
    }
}
