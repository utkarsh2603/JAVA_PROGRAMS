public class TillingProblem
{
    public static int ways(int length)
    {
        if(length==0)
        {
            return 1;
        }
        if(length==1)
        {
            return 1;
        }
        int vertical=ways(length-1);
        int horizontal=ways(length-2);

        int total_ways=vertical+horizontal;
        return total_ways;
    }
    public static void main(String args[])
    {
        int length=4;
        System.out.println(ways(length));
    }
}
