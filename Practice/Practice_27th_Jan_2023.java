public class Practice_27th_Jan_2023
{
    //linear search

//    static int  linearSearch(int array[],int key)
//    {
//        for(int i=0;i< array.length;i++)
//        {
//            if(array[i]==key)
//            {
//                return i;
//            }
//
//        }
//        return -1;
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5,6,7,8,9};
//        int key=5;
//        System.out.println(linearSearch(array,key));
//    }

    //binary search

//    static int binarySearch(int array[],int key)
//    {
//        int start=0;
//        int end= array.length-1;
//        while(start<=end)
//        {
//            int mid=(start+end)/2;
//            if(array[mid]==key)
//            {
//                return mid;
//            }
//            if(array[mid]<key)
//            {
//                start=mid+1;
//            }
//            else
//            {
//                end=mid-1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5,6,7,8,9};
//        int key=10;
//        System.out.println(binarySearch(array,key));
//    }

    //largest in an array

//    public static void main(String args[])
//    {
//        int array[]={3,5,8,1,4,9,2,4};
//        int largest=Integer.MIN_VALUE;
//        for(int i=0;i< array.length;i++)
//        {
//            if(array[i]>largest)
//            {
//                largest=array[i];
//            }
//        }
//        System.out.println(largest);
//    }

    //revering an array

//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5,6,7,8,9};
//        int start=0;
//        int end=array.length-1;
//        while(start<=end)
//        {
//            int temp=array[start];
//            array[start]=array[end];
//            array[end]=temp;
//
//            start++;
//            end--;
//        }
//        for(int i=0;i< array.length;i++)
//        {
//            System.out.println(array[i]);
//        }
//    }


    //Pairs in an array

//    static void pairs(int array[])
//    {
//        for(int i=0;i< array.length;i++)
//        {
//            for(int j=i+1;j< array.length;j++)
//            {
//                System.out.print("("+array[i]+","+array[j]+")");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//        pairs(array);
//    }

    //Printing subarrays
    static void pritningSubarrays(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                for(int k=i;k<j;k++)
                {
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        pritningSubarrays(array);
    }
}
