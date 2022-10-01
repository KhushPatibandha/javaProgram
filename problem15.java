// Take an array of numbers as input and 
// check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//      {3, 4, 6, 2} is not sorted in ascending order.
// *************************************************


import java.util.Scanner;

public class problem15 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i = 0; i < numbers.length-1; i++)
        {
            if(numbers[i] > numbers[i+1])
            {
                isAscending = false;
            }
        }

        if(isAscending)
        {
            System.out.println("Array is sorted in ascending");
        }
        else
        {
            System.out.println("Array is not sorted in ascending");
        }
        sc.close();
    }    
}
