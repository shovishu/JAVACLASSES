import java.util.Scanner;

public class Polymorphism
{
    public  String Method1(String str1)
    {
        String Str=str1;
        return Str;
    }
    public int Method2(int Num)
    {
        int num=Num;
        return num;
    }
    public static void main(String args[])
    {
        Polymorphism obj=new Polymorphism();
        String string=obj.Method1("Vishwajeet");
        int Num=obj.Method2(23);

        System.out.println("Name: "+string);
        System.out.println("Age: "+Num);

    }
}
