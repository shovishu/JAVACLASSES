public class FactorialUsingRecursion
{
    public static void main(String[] args) {
        int num = 5;
        long factorial = Factorial(num);
        System.out.println("Factorial is "+factorial);
    }
    public static long Factorial(int num)
    {
        if (num >= 1)
            return num * Factorial(num - 1);
        else
            return 1;
    }
}
