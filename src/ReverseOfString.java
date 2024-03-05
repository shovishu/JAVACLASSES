import java.util.Scanner;

public class ReverseOfString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();

        System.out.print("After reverse string is: ");
        for (int i = s.length(); i > 0; i--)
        {
            System.out.print(s.charAt(i - 1));
        }
    }
}
