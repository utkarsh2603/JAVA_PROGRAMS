public class Fibonacchi
{
    public static int fib(int nth)
    {
        if(nth==0)
        {
            return 0;
        }
        if(nth==1)
        {
            return 1;
        }
        int fnm1=fib(nth-1);
        int fnm2=fib(nth-2);

        int fib_n=fnm1+fnm2;
        return fib_n;
    }
    public static void main(String args[])
    {
        int n=6;
        System.out.println(fib(n));
    }
}
