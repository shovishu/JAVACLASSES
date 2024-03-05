//Take 3 inputs from user and check :
//        - all are equal
//        - any of two are equal
//        ( use && || )

import java.util.Scanner;

public class EqualOrNot
{
    public static void main(String args[])
    {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int a=num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the num2: ");
        int b=num2.nextInt();
        Scanner num3 = new Scanner(System.in);
        System.out.print("Enter the num3: ");
        int c=num3.nextInt();

        isEqual(a,b,c);
    }
    public static void isEqual(int a,int b,int c)
    {
        if(a==b&&b==c&&c==a)
        {
            System.out.println("All are Equal");
        }
        else if(a==b||b==c||c==a)
        {
            System.out.println("Any two are equal");
        }
    }
}
