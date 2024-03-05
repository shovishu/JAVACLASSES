
public class CountOccurences
{

    public static void main(String args[])
    {
        String Str = "coderolls";
        char to_find = 'o';
        int arr[] = new int[26];

        for(int i=0;i<Str.length();i++)
        {
            arr[Str.charAt(i) - 97]++;
        }
        int result = arr[to_find-97];
        System.out.println(result);
    }
}