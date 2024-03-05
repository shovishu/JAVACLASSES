import java.util.Scanner;

public class ClassStudent
{
    public static void main(String args[])
    {
        Scanner NAME = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name=NAME.next();
        Scanner ROLL_NO = new Scanner(System.in);
        System.out.print("Enter the roll_no: ");
        int roll_no=ROLL_NO.nextInt();

        Name_RollNo(name, roll_no);
    }
    public static void Name_RollNo(String name, int roll_no)
    {
        System.out.println("My Name is "+name);
        System.out.println("My Roll_No is "+roll_no);
    }
}
