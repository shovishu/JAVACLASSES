public class Pattern
{
    public static void main(String[] args)
    {
        int k = 0;
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 0; j <= k; j++)
            {
                System.out.print("*");
            }
            k += i;
            System.out.println();
        }
    }

}