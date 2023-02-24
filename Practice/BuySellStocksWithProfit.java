public class BuySellStocksWithProfit
{
    public static int profitablestock(int array[])
    {
        int n=array.length;
        int left_Min_Buying[]= new int[n];
        left_Min_Buying[0]=array[0];
        for(int i=1;i<n;i++)
        {
            left_Min_Buying[i]=Math.min(array[i],left_Min_Buying[i-1]);
        }

        int right_Max_Selling[]= new int[n];
        right_Max_Selling[n-1]=array[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right_Max_Selling[i]=Math.max(array[i],right_Max_Selling[i+1]);
        }

        int maxProfit=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int max= (right_Max_Selling[i]-left_Min_Buying[i]);
            if(max<maxProfit)
            {
                maxProfit=max;
            }

        }
        return maxProfit;
    }
    public static void main(String args[])
    {
        int array[]={7,1,5,6,1,4};

        System.out.println(profitablestock(array));
    }
}
