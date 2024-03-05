public class MethodTypes
{

    //1.Methods without args
    public  void Addition()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }

    //2.Methods with args
    public void Add(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }

    public  static  void main(String args[])
    {
        MethodTypes obj1=new MethodTypes();
        obj1.Addition();
        obj1.Add(2,3);
    }
}
