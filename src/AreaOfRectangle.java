public class AreaOfRectangle
{

    public void Area(int l,int b)
    {
        int Area=l*b;
        System.out.println(Area);
    }
    public static void main(String args[])
    {
        AreaOfRectangle obj=new AreaOfRectangle();
        obj.Area(10,15);
    }
}
