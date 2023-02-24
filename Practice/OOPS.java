public class OOPS
{
    public static void main(String args[])
    {
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
 class Pen
{
    private String color="red";
    private int tip;

    String getColor()
    {
        return this.color;
    }

    int getTip()
    {
        return this.tip;
    }

    void setColor(String newcolor)
    {
        color=newcolor;
    }
    void setTip(int newtip)
    {
        tip=newtip;
    }
}
