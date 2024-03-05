import java.util.Scanner;
public class NumberFormatException
{
    public static void main( String[] arg)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your age : ");

        age = Integer.parseInt(sc.next());
        System.out.println("Your age is : " +age);
    }
}