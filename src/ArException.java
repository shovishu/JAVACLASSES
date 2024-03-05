public class ArException
{
    public static void main(String args[])
    {
        try{
            int num1=30, num2=0;
            int ans=num1/num2;
            System.out.println ("Result: "+ans);
        }
        catch(ArithmeticException ae){
            System.out.println ("cannot divide a number by zero");
        }
    }
}
