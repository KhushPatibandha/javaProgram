// floor of a number
// greatest number <= target

public class problem45 
{
    static int floor(int arr[], int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
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

        return end;
    }
    
    public static void main(String[] args) 
    {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int ans = floor(arr, 1);
        System.out.println(ans);
    }    
}