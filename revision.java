
public class revision 
{   
    public static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int arr[] = {6,2,1,0,9};

        for(int i = 0; i < arr.length; i++)
        {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}