import java.util.Scanner;

public class Tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:"); //Enter 24,29,50
        int num=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }

}
