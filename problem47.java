// Find in Mountain Array
// find the given target in mountain array
// use order agnostic, find peak idx, search
// ****************************** 

public class problem47 
{
    public static int peakIdxInMountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end)
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid] > arr[mid+1])
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }
        }
        
        return start;
    }
    
    static int orderAgnostic(int arr[], int target, int start, int end)
    {
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
    
    public static int search(int[] arr, int target)
    {
        int peak = peakIdxInMountainArray(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        
        if(firstTry != -1)
        {
            return firstTry;
        }
        
        // try to search in second helf
        return orderAgnostic(arr, target, peak+1, arr.length-1);
    }

    public static void main(String[] args) 
    {
        int[] mountainArr = {1,2,3,4,5,3,1};
        // int[] mountainArr = {0,1,2,4,2,1};
        int target = 3;

        System.out.println(search(mountainArr, target));
    }    
}