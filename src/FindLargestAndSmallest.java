public class FindLargestAndSmallest
{
    public static void main(String[] args) {
        int arr[] = new int[]{33,53,73,94,22,45,23,87,13,63};
        int smallest = arr[0];
        int largest = arr[0];

        for(int i=1; i< arr.length; i++)
        {
            if(arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];

        }

        System.out.println("Largest arr is : " + largest);
        System.out.println("Smallest arr is : " + smallest);
    }
}