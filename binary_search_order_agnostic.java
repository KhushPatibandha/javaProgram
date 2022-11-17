public class binary_search_order_agnostic 
{
    static int orderAgnostic(int arr[], int target)
    {
        int start = 0;
        int end = arr.length-1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        
        while(start <= end)
        {
            // find the middle element
            int mid = start + (end-start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }

            if(isAsc)
            {
                if(target < arr[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            else
            {
                if(target > arr[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }   
        return -1;
    }
    public static void main(String[] args) 
    {
        // int arr[] = {-100, -51, -8, -1, 12, 42, 52, 62, 64, 72, 73, 99};
        int arr[] = {100, 99, 31, 30, 21, 1, -1};
        
        int ans = orderAgnostic(arr, 31);
        System.out.println(ans);
    }    
}