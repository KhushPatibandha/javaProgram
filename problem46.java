// Infinite array 
// find the target without using length function 

public class problem46 
{
    static int ans(int arr[], int target)
    {
        // first find the range
        // first start with the box of size 2

        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end])
        {
            int newStart = end+1;
            // double the box value
            // end = previous end + sizeOfBox*2
            
            end = end + (end-start+1)*2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end-start)/2;

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
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 41, 61, 71, 89, 99};
        System.out.println(ans(arr, 10));  
    }    
}