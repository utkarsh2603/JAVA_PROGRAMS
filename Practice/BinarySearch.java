public class BinarySearch {
    public static int search(int array[], int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        int array[]={10,20,30,40,50};
        int key=40;

        int index =search(array,key);

        if(index == -1) {
            System.out.println("INDEX NOT FOUND");
        }
        else
        {
            System.out.println(index);
        }
    }
}
