import java.util.Scanner;
public class Product
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();

        ProductOfNumber(num1,num2);
    }
    public static void ProductOfNumber(int x,int y)
    {
        int result=0;
        result=x*y;
        System.out.println("product of two numbers  "+result);
    }
}