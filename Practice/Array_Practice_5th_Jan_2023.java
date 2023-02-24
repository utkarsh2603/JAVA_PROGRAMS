//import java.util.*;
//
//public class Array_Practice_5th_Jan_2023 {
//    public static void main(String args[]) {
//
//        Scanner sc=new Scanner(System.in);
//    //int array[]={1,2,3,4};
//    int array[] = new int[5];
//    for(int i=0;i<array.length;i++)
//    {
//        System.out.println("Enter numbers: ");
//        array[i]=sc.nextInt();
//    }
//    for(int i=0;i<array.length;i++)
//    {
//        array[3]=5;
//        System.out.print(array[i]+" ");
//    }
//}
//
//    public static void linearSearch(int array[],int key)
//    {
//        for(int i=0;i<array.length;i++)
//        {
//            if(array[i]==key)
//            {
//                System.out.println(i);
//                return;
//            }
//        }
//        System.out.println("-1");
//
//    }
//    public static void printArray(int array[])
//    {
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.println(array[i]);
//        }
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//        int key=3;
//
//        linearSearch(array,key);
//        //printArray(array);
//    }
//
//    public static int binarySearch(int array[],int key)
//    {
//        int start=0;
//        int end=array.length;
//
//        while(start<=end)
//        {
//            int mid=(start+end)/2;
//
//            if(array[mid]==key)
//            {
//                return mid;
//            }
//            if(array[mid]<key)
//            {
//                start=mid+1;
//            }
//            else
//                end=mid-1;
//        }
//        return -1;
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5,6};
//        int key=5;
//
//        System.out.println(binarySearch(array,key));
//    }
//
//
//    public static int largest(int array[])
//    {
//        int largest=Integer.MIN_VALUE;
//
//        for(int i=0;i<array.length;i++)
//        {
//            if(array[i]>largest)
//            {
//                largest=array[i];
//            }
//        }
//        return largest;
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,4,6,77,19,2,2,5,33,5};
//        System.out.println(largest(array));
//    }
//
//    public static void reverseArray(int array[])
//    {
//        int last=array.length-1;
//        int first=0;
//        while(first<last)
//        {
//            int temp=array[first];
//            array[first]=array[last];
//            array[last]=temp;
//            last--;
//            first++;
//        }
//    }
//    public static void printArray(int array[])
//        {
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.println(array[i]);
//        }
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5,6,7,8,9};
//        reverseArray(array);
//        printArray(array);
//
//    }
//
//    public static void printpairs(int array[])
//    {
//        for(int i=0;i<array.length;i++)
//        {
//            for(int j=i+1;j<array.length;j++)
//            {
//                System.out.print(array[i]+","+array[j]+ " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//        printpairs(array);
//    }
//
//    public static void printSubarrays(int array[])
//    {
//        for(int start=0;start<array.length;start++)
//        {
//            for(int end=start+1;end<array.length;end++)
//            {
//                for(int k=start;k<end;k++)
//                {
//                    System.out.print(array[k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//        printSubarrays(array);
//    }
//
//
//    public static int maxSubarraySum(int array[])
//    {
//        int currSum=0;
//        int largest=Integer.MIN_VALUE;
//        for(int start=0;start<array.length;start++)
//        {
//
//            for(int end=start+1;end<=array.length;end++)
//            {
//                currSum=0;
//                for(int k=start;k<end;k++)
//                {
//                    currSum=currSum+array[k];
//                }
//               // System.out.println(currSum);
//                if(largest<currSum)
//                {
//                    largest=currSum;
//                }
//            }
//        }
//        return largest;
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//        System.out.println(maxSubarraySum(array));
//    }
//
//
//    public static void prefixSum(int array[])
//    {
//        int largest=Integer.MIN_VALUE;
//        int currSum=0;
//        int prefix[]=new int[array.length];
//        prefix[0]=array[0];
//        for(int i=1;i<array.length;i++) {
//            prefix[i] = prefix[i - 1] + array[i];
//        }
//
//        for(int i=0;i<array.length;i++)
//        {
//            int start=i;
//            for(int j=i;j<array.length;j++)
//            {
//                int end=j;
//                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
//
//                if(currSum>largest)
//                {
//                    largest=currSum;
//                }
//            }
//        }
//        System.out.println(largest);
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5,6,7};
//        prefixSum(array);
//    }
//
//    public static void kadanes(int array[])
//    {
//        int currSum=0;
//        int largest=Integer.MIN_VALUE;
//        for(int i=0;i<array.length;i++)
//        {
//            currSum+=array[i];
//            if(currSum<0)
//            {
//                currSum=0;
//            }
//            largest=Math.max(currSum,largest);
//        }
//        System.out.println(largest);
//
//    }
//    public static void main(String[] args)
//    {
//        int array[]={1,2,3,4,5};
//
//        kadanes(array);
//    }
//
//    public static int trappingrainwater(int array[]) {
//        int n = array.length;
//        int leftmax[] = new int[n];
//        leftmax[0] = array[0];
//        for (int i = 1; i < array.length; i++) {
//            leftmax[i] = Math.max(leftmax[i - 1], array[i]);
//        }
//
//        int rightmax[] = new int[n];
//        rightmax[n - 1] = array[n - 1];
//        for (int i = n - 2; i >= 0; i--) {
//            rightmax[i] = Math.max(rightmax[i + 1], array[i]);
//        }
//
//        int trappedwater = 0;
//        for (int i = 0; i < n; i++) {
//            int waterlevel = Math.min(leftmax[i], rightmax[i]);
//            trappedwater+=waterlevel-array[i];
//
//        }
//        return trappedwater;
//    }
//    public static void main(String args[])
//    {
//        int array[]={4,2,0,6,3,2,5};
//        System.out.println(trappingrainwater(array));
//    }
//
//}
