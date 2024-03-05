public class RemoveChar
{
    public static void main(String[] args)
    {
        String str = "America";
        System.out.println(charRemoveAt(str, 6));
    }
    public static String charRemoveAt(String str, int p)
    {
        return str.substring(0, p) + str.substring(p + 1);
    }
}