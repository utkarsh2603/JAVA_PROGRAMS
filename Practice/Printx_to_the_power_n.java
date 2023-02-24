public class Printx_to_the_power_n
{
    public static int power(int x, int n)
        {
            if (n == 0) {
                return 1;
            }
            int xnm1 = power(x, n - 1);
            int xn = x * xnm1;
            return xn;
        }

    public static int OptimisedPower(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfpowersq=OptimisedPower(x,n/2)*OptimisedPower(x,n/2);

        if(n%2!=0)
        {
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }

        public static void main (String args[])
        {
            int x = 2;
            int n = 10;
            System.out.println(OptimisedPower(x, n));
        }
    }
