public class binary_search 
{
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int arr[], int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            // find middle element
            int mid = start + (end - start)/2;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                // element found
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) 
    {
        int arr[] = {-100, -51, -8, -1, 12, 42, 52, 62, 64, 72, 73, 99};
        int ans = binarySearch(arr, -1);
        System.out.println(ans);
    }
}