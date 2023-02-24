public class Practice
{
    public static int search (int array[], int key)
    {
        int start = 0;
        int end = array.length-1;



        while (start <= end){

            int mid = (start + end) / 2;
            if (array[mid] == key)
            {
                return mid;
            }
            if (array[mid] < key)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main (String args[])
    {
        int[] array = { 12, 24, 67,88 };
        int key = 24;

        System.out.println (search (array, key));
    }
}

