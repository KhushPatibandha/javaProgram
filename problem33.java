// Check if an array is sorted (strictly increasing). 
// Time complexity = O(n)

// *************************


public class problem33 
{
    public static boolean isSorted(int arr[], int idx)
    {
        if(idx == arr.length-1)
        {
            return true;
        }


        // a bit better time complixity with thisone
        if(arr[idx] >= arr[idx+1])
        {
            // array is unsorted  
            return false;
        }
        return isSorted(arr, idx+1);


        // bad time complixity with thisone 
        // if(arr[idx] < arr[idx+1])
        // {
        //     // array is sorted until now 
        //     return isSorted(arr, idx+1);
        // }
        // else
        // {
        //     return false;
        // }
    }
        public static void main(String[] args) 
    {
        int arr[] = {1,3,5};
        System.out.println(isSorted(arr, 0));
    }    
}