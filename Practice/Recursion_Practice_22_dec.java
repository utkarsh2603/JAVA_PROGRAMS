public class Recursion_Practice_22_dec
{
    /*
    public static void printdecreasing(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdecreasing(n-1);
    }

    public static void main(String args[])
    {
        int n=10;

        printdecreasing(n);
     */

   /*
    public static void printIncreasing(int n)
    {
        if(n==1)
        {
            System.out.print(n+ " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String args[])
    {
        int n=10;

        printIncreasing(n);
    */

    /*
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*fnm1;

        return fn;

    }
    public static void main(String args[])
    {
        int n=5;

        System.out.println(factorial(n));
     */

    /*
    public static int sumoffirstnnumbers(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int fnm1=sumoffirstnnumbers(n-1);
        int sum=n+fnm1;

        return sum;
    }
    public static void main(String args[])
    {
        int n=10;

        System.out.println(sumoffirstnnumbers(n));
     */

    /*
    public static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }

        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);

        int fnth=fnm1+fnm2;

        return fnth;
    }
    public static void main(String args[])
    {
        int n=20;

        System.out.println(fibonacci(n));
     */

    public static boolean checksortedornot(int array[],int i)
    {
        if(i==array.length-1)
        {
            return true;
        }
        if(array[i]>array[i+1])
        {
            return false;
        }
        return checksortedornot(array,i+1);
    }
    public static void main(String args[])
    {
        int array[]={4,7,9,10};

        System.out.println(checksortedornot(array,0));
    }
}