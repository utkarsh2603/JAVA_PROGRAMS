public class PrintIncreasingUsingRecursion
{
    public static void printInc(int num)
    {
        if(num==1)
        {
            System.out.println(num);
            return;
        }
        printInc(num-1);
        System.out.print(num);
    }
    public static void main(String args[])
    {
        int number=10;
        printInc(number);
    }
}
