import java.util.Scanner;

public class isEqual
{
    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter Str1:");
        String str1= sc1.next();
        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter Str2:");
        String str2= sc2.next();

        System.out.println(str1.equals(str2));

    }
}
