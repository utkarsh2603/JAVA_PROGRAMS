public class PairsInArray
{
    public static int search(int array[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++) {
            int curr = i;
            for (int j = i ; j < n; j++) {
                //System.out.print("("+curr+","+array[j]+")");
                int end=j;
                for(int k=i;k<j;k++)
                {
                    sum=sum+array[k];
                    System.out.print(array[k]+" ");

                }
                System.out.println();
            }
            System.out.println();
        }
        return sum;
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        int n= array.length;

        int sum=search(array,n);

        System.out.println(sum);

    }
}
