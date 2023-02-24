public class FindSubsetsUsingRecursion
{
    public static void printsubsets(String str,String ans,int index)
    {
        if(index==str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        printsubsets(str,ans+str.charAt(index),index+1);
        printsubsets(str,ans,index+1);
    }
    public static void main(String args[])
    {
        String str="abc";

        printsubsets(str,"",0);
    }
}
