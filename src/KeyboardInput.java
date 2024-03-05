import java.util.Scanner;

public class KeyboardInput
{
    public void ProductOfNumbers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name:");
        String Fname= sc.next();
        System.out.print("Enter First Name:");
        String Lname= sc.next();
        System.out.println(Fname+" "+Lname);
    }
    public static void main(String args[])
    {
        KeyboardInput obj=new KeyboardInput();
        obj.ProductOfNumbers();
    }
}
