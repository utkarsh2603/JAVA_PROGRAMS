public class PrintDecreasingUsingRecursion
{
    public static void printdesc(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.print(num+" ");
        printdesc(num-1);
    }
    public static void main(String args[])
    {
        int number=10;
        printdesc(number);
    }
}
