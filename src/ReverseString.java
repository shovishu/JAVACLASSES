import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String OStr = scanner.nextLine();
        scanner.close();

        String words[] = OStr.split("\\s");
        String RString = "";

        for (int i = 0; i < words.length; i++)
        {
            if (i == words.length - 1)
                RString = words[i] + RString;
            else
                RString = " " + words[i] + RString;
        }

        System.out.print("Reversed string : " + RString);
    }
}