// Rotation count 
// Count the number of rotation in the array
// Just find pivot and add 1 to it and that's the number of rotation
// *******************************

public class problem48 
{
    // Use for non-duplicates
    public static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }

            if(arr[mid] <= arr[start])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }

        return -1;
    }

    // Use this for duplicates
    static int findPivotWithDuplicates(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            
            // 4 cases
            
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid; 
            }
            
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            
            // if elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {
                // Skip the duplicates
                
                // NOTE : But what if these elements at start and end were the pivots?
                // Check if start is pivot
                if(arr[start] > arr[start+1])
                {
                    return start;
                }
                start++;
                
                // Check whether end is pivot 
                if(arr[end] < arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            
            // Left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) 
    {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        // int[] arr = {4, 5, 5, 6, 0, 2, 2, 3};

        int pivot = findPivot(arr);
        // int pivot = findPivotWithDuplicates(arr);

        int countRotation = pivot+1;

        System.out.println(countRotation);
    }    
}