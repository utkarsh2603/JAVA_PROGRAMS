import java.util.*;

public class Multi_Dimentional_ArrayList
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

        //first list
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);

        //Second list
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        ArrayList<Integer> list3= new ArrayList<>();
        list3.add(5);
        list3.add(6);
        mainList.add(list3);

        System.out.println(mainList);



    }
}
