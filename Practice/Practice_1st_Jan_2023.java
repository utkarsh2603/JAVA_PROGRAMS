import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collector;

//------------------------------------------------------------------------------------------------------------
/* -----------------------------------------------ARRAYS--------------------------------------------------- */
//------------------------------------------------------------------------------------------------------------


//public class Practice_1st_Jan_2023
//{
//    public static void search(int array[], int key)
//    {
//        for(int i=0;i<array.length;i++)
//        {
//            if(array[i]==key)
//            {
//                System.out.println(i);
//            }
//        }
//
//    }
//
//
//    public static void main(String args[])
//    {
//        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int key = 5;
//
//        search(array, key);
//    }
//
//    public static int largest(int array[])
//    {
//        int largest=Integer.MAX_VALUE;
//        for(int i=0;i<array.length;i++)
//        {
//            if(largest>array[i])
//            {
//                largest=array[i];
//            }
//        }
//        return largest;
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5,6,7,8,9};
//        int max_in_an_array=largest(array);
//        System.out.println(max_in_an_array);
//    }

//    public static void reverse_an_array(int array[]) {
//        int last = array.length - 1;
//        int first = 0;
//        while (first < last)
//        {
//                int temp = array[last];
//                array[last] = array[first];
//                array[first] = temp;
//
//                first++;
//                last--;
//        }
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5,6,7,8,9};
//
//        reverse_an_array(array);
//
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.print(array[i]+ " ");
//        }
//    }

//    public static void printpairs(int array[])
//    {
//        for(int i=0;i<array.length;i++)
//        {
//            for(int j=i+1;j<array.length;j++)
//            {
//                System.out.print("("+array[i]+","+array[j]+")");
//            }
//        }
//        System.out.println();
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//
//        printpairs(array);
//    }

//    public static void printpairs(int array[])
//    {
//        for(int i=0;i<array.length;i++)
//        {
//            for(int j=i;j<array.length;j++)
//            {
//                for(int k=i;k<j;k++)
//                {
//                    System.out.print(array[k]+ " ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//
//        printpairs(array);
//    }

//    public static void printpairs(int array[])
//    {
//        int largest=Integer.MIN_VALUE;
//        int currSum=0;
//        for(int i=0;i<array.length;i++)
//        {
//            for(int j=i;j<array.length;j++)
//            {
//                currSum=0;
//                for(int k=i;k<j;k++)
//                {
//                    currSum+=array[k];
//                }
//                System.out.println(currSum);
//
//                if(currSum>largest)
//                {
//                    largest=currSum;
//                }
//            }
//        }
//        System.out.println(largest);
//
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//
//        printpairs(array);
//        //System.out.println(max);
//    }

//    public static void maxsubarrayprefixsum(int array[])
//    {
//        int largest=Integer.MIN_VALUE;
//        int currSum=0;
//         int n=array.length;
//
//         int prefix[]=new int[n];
//         prefix[0]=array[0];
//
//         for(int i=1;i<n;i++)
//         {
//             prefix[i]=prefix[i-1]+array[i];
//         }
//
//         for(int i=0;i<n;i++)
//         {
//             int start=i;
//             for(int j=i;j<n;j++)
//             {
//                 int end=j;
//                 currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
//
//                 if(largest<currSum)
//                 {
//                     largest=currSum;
//                 }
//             }
//         }
//
//        System.out.println(largest);
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//
//        maxsubarrayprefixsum(array);
//    }

//    public static int maxsubarraysumkadaenes(int array[])
//    {
//        int largest=Integer.MIN_VALUE;
//        int currSum=0;
//
//        for(int i=0;i<array.length;i++)
//        {
//            currSum=currSum+ array[i];
//            if(currSum<0)
//            {
//                currSum=0;
//            }
//            largest=Math.max(currSum,largest);
//        }
//        return largest;
//    }
//    public static void main(String args[])
//    {
//        int array[]={1,2,3,4,5};
//
//        System.out.println(maxsubarraysumkadaenes(array));
//    }

//    public static int trappingrainwater(int array[])
//    {
//        int n=array.length;
//        //leftmax
//        int leftmax[]=new int[n];
//        leftmax[0]=array[0];
//        for(int i=1;i<n;i++)
//        {
//            leftmax[i]=Math.max(array[i],leftmax[i-1]);
//        }
//
//        //rightmax
//        int rightmax[]=new int[n];
//        rightmax[n-1]=array[n-1];
//        for(int i=n-2;i>=0;i--) {
//            rightmax[i] = Math.max(array[i], rightmax[i +1]);
//        }
//
//        int trappedwater=0;
//        for(int i=0;i<n;i++)
//        {
//            int waterlevel=Math.min(leftmax[i],rightmax[i]);
//            trappedwater+=waterlevel-array[i];
//        }
//        return trappedwater;
//    }
//
//    public static void main(String args[])
//    {
//        int array[]={4,2,0,6,3,2,5};
//
//        System.out.println(trappingrainwater(array));
//    }

//}


//------------------------------------------------------------------------------------------------------------
/* ---------------------------------------------SORTING TECHNIQUES-------------------------------------------- */
//------------------------------------------------------------------------------------------------------------

//public class Practice_1st_Jan_2023
//{
//    public static void bubblesort(int array[])
//    {
//        for(int turn=0;turn<array.length-1;turn++)
//        {
//            for(int i=0;i<array.length-1-turn;i++)
//            {
//                if(array[i]>array[i+1])
//                {
//                    int temp=array[i];
//                    array[i]=array[i+1];
//                    array[i+1]=temp;
//
//                }
//            }
//        }
//    }
//    public static void main(String args[])
//    {
//        int array[]={2,1,3,5,4};
//
//        bubblesort(array);
//
//
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.print(array[i]+" ");
//        }
//    }


//    public static void selectionsort(int array[])
//    {
//        for(int i=0;i<array.length;i++)
//        {
//            int minPos=i;
//            for(int j=i+1;j<array.length;j++)
//            {
//                if(array[minPos]>array[j])
//                {
//                    minPos=j;
//                }
//            }
//            int temp=array[minPos];
//            array[minPos]=array[i];
//            array[i]=temp;
//        }
//    }
//    public static void main(String args[])
//    {
//        int array[]={5,4,1,3,2};
//
//        selectionsort(array);
//
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.print(array[i]+" ");
//        }
//    }

//    public static void insertionsort(int array[])
//    {
//        for(int i=1;i<array.length;i++)
//        {
//            int curr=array[i];
//            int prev=i-1;
//            while(prev>=0 && array[prev]>curr)
//            {
//                array[prev+1]=array[prev];
//                prev--;
//            }
//            array[prev+1]=curr;
//        }
//    }
//    public static void main(String args[])
//    {
//        int array[]={5,4,1,3,2};
//
//        insertionsort(array);
//
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.print(array[i]+" ");
//        }
//    }


//    public static void inbuiltsort(int array[])
//    {
//        Arrays.sort(array);
//    }
//    public static void main(String args[])
//    {
//        int array[]={5,4,3,1,2};
//
//        inbuiltsort(array);
//
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.println(array[i]+ " ");
//        }
//
//    }
//}


//-----------------------------------------------------------------------------------------------------------
/* ---------------------------------------------2-D ARRAYS---------------------------------------------------- */
//------------------------------------------------------------------------------------------------------------

//public class Practice_1st_Jan_2023
//{
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        int matrix[][]=new int[3][2];
//        int n=matrix.length;
//        int m=matrix[0].length;
//
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//
//    }

//    public static void searchkeyinmatrix(int matrix[][],int key)
//    {
//        for(int i=0;i<matrix.length;i++)
//        {
//            for(int j=0;j<matrix[0].length;j++)
//            {
//                if(matrix[i][j]==key)
//                {
//                    System.out.println("("+i+","+j+")");
//                }
//            }
//        }
//    }
//    public static void main(String args[])
//    {
//        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int key=5;
//
//        searchkeyinmatrix(matrix,key);
//    }

//    public static void spiralMatrix(int matrix[][]) {
//        int startRow = 0;
//        int endRow = matrix.length - 1;
//        int startCol = 0;
//        int endCol = matrix[0].length - 1;
//
//        //top
//        while (startRow <= endRow && startCol <= endCol) {
//            for (int i = startRow; i <= endCol; i++) {
//                System.out.print(matrix[startRow][i] + " ");
//            }
//
//            //right
//            for (int j = startRow + 1; j <= endRow; j++) {
//                System.out.print(matrix[j][endCol] + " ");
//            }
//
//            //bottom
//            for (int i = endCol - 1; i >= startCol; i--) {
//                System.out.print(matrix[endRow][i] + " ");
//            }
//
//            //left
//            for (int j = endRow - 1; j >= startRow + 1; j--) {
//                System.out.print(matrix[j][startCol] + " ");
//            }
//
//            startRow++;
//            startCol++;
//            endCol--;
//            endRow--;
//
//        }
//    }
//    public static void main(String args[])
//    {
//        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//
//        spiralMatrix(matrix);
//    }

//    public static int diagonalSum(int matrix[][])
//    {
//        int sum=0;
//        for(int i=0;i<matrix.length;i++)
//        {
//            sum+=matrix[i][i];
//            if(i!= matrix.length-i-1)
//            sum+=matrix[i][matrix.length-i-1];
//        }
//        return sum;
//    }
//    public static void main(String args[])
//    {
//        //int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
//
//        System.out.println(diagonalSum(matrix));
//    }

//    public static void search(int matrix[][],int key)
//    {
//        int row=0;
//        int col=matrix[0].length-1;
//
//        while(row<matrix.length && col>=0)
//        {
//            if(matrix[row][col]==key)
//            {
//                System.out.println(row+" "+col);
//                return;
//            }
//            else if(key<matrix[row][col])
//            {
//                col--;
//            }
//            else
//            {
//                row++;
//            }
//        }
//
//
//    }
//    public static void main(String args[])
//    {
//        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//        int key=22;
//
//        search(matrix,key);
//    }

//------------------------------------------------------------------------------------------------------------
/* ---------------------------------------------------STRINGS----------------------------------------------- */
//------------------------------------------------------------------------------------------------------------

//public class Practice_1st_Jan_2023
//{
//    public static void printletter(String str)
//    {
//        for(int i=0;i<str.length();i++)
//        {
//            System.out.print(str.charAt(i)+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String args[])
//    {
//        String str=new String("Tony");
//        printletter(str);
//    }

//    public static boolean palindrome(String str)
//    {
//        int n=str.length();
//        for(int i=0;i<n/2;i++)
//        {
//            if(str.charAt(i)!=str.charAt(n-i-1))
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String args[])
//    {
//        String str="racercar";
//
//        System.out.println(palindrome(str));
//    }

//    public static void shortestPath(String str) {
//        int x = 0;
//        int y = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'N') {
//                y = y + 1;
//            } else if (str.charAt(i) == 'S') {
//                y--;
//            } else if (str.charAt(i) == 'E') {
//                x++;
//            } else if (str.charAt(i) == 'W') {
//                x--;
//            }
//        }
//        System.out.println("Shortest Path is: "+x+","+y);
//        int x2=x*x;
//        int y2=y*y;
//
//        float dist=(float)Math.sqrt(x2+y2);
//
//        System.out.println(dist);
//
//    }
//
//    public static void main(String args[])
//    {
//        String str="WNEENESENNN";
//
//        shortestPath(str);
//    }

//    public static void main(String args[])
//    {
//        String s1="URY";
//        String str=new String("URYt");
//        if(s1.equals(str))
//        {
//            System.out.println("same");
//        }
//        else
//            System.out.println("not same");
//    }

//    public static void main(String args[])
//    {
//        String str=new String("UTKARSH");
//        int si=0;
//        int ei=4;
//
//        for(int i=si;i<ei;i++)
//        {
//            System.out.print(str.charAt(i));
//        }
//    }

//    public static String toUpperCase(String str)
//    {
//        StringBuilder sb= new StringBuilder("");
//        char ch=Character.toUpperCase(str.charAt(0));
//        sb.append(ch);
//
//        for(int i=1;i<str.length();i++)
//        {
//            if(str.charAt(i)==' ' && i<str.length()-1)
//            {
//                sb.append(str.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i)));
//            }
//            else {
//                sb.append(str.charAt(i));
//            }
//
//        }
//        return sb.toString();
//    }
//    public static void main(String args[])
//    {
//        String str="my name i s Ut karsh";
//        System.out.println(toUpperCase(str));
//    }

//    public static String stringCompress(String str)
//    {
//        String newstr="";
//        for(int i=0;i<str.length();i++)
//        {
//            Integer count=1;
//            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
//                count++;
//                i++;
//            }
//            newstr+=str.charAt(i);
//
//            if(count>1)
//            {
//                newstr+=count.toString();
//            }
//        }
//        return newstr;
//    }
//    public static void main(String args[]) {
//        String str = "aaabbcccdd";
//        System.out.println(stringCompress(str));
//    }
//}